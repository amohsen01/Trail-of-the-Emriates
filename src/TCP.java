import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TCP extends ConcreteSubject implements Runnable
{
	// ip address of the machine 
    String host = "192.168.0.199";
    
    // need the port 
    int port = 8080;
    
	TCP(String host, int port){
		
		// set the ip address and the port of the 
		// the server we will connect to.
		
		this.host = host;
		this.port = port;
		
		// make this a thread
		Thread t = new Thread(this);
		t.start();
	}

	
	public void run() {
		
		try {
		
			Socket socket = new Socket(host, port);
			
            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
 
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            JSONParser parser = new JSONParser();
        	JSONObject jsonObject = new JSONObject();
            while ((line = br.readLine()) != null)
            {
            try 
            {
				jsonObject = (JSONObject) parser.parse(line);
			}
            catch (ParseException e) 
            {
				e.printStackTrace();
			}
            
            String orientation = (String) jsonObject.get("deviceOrientation");
            int OR = Integer.parseInt(orientation);
            
            switch (OR) {
            	case 1:
            		Message m = new Message(this, "movement", "portrait");
            		publishMessage(m); 
            		break;
            	case 2: 
            		m = new Message(this, "movement", "upside-down");
            		publishMessage(m); 
            		break;
            	case 3: 
            		m = new Message(this, "movement", "left");
            		publishMessage(m); 
            		break;
            	case 4: 
            		m = new Message(this, "movement", "right");
            		publishMessage(m); 
            		break;
            	case 5:
            		m = new Message(this, "movement", "up");
            		publishMessage(m); 
            		break;
            	case 6: 
            		m = new Message(this, "movement", "down");
            		publishMessage(m); 
            		break;
            	}
            
            	String accZ = (String) jsonObject.get("accelerometerAccelerationZ");
            	double acc = Double.parseDouble(accZ);
            	//System.out.println("Z acceleration is: " + acc);
            	
            	if (acc!=0)
            	{
            		Message n = new Message(this, "phone", "wave");
        			publishMessage(n); 
            	}
            
            
            }
            
        } 
		catch (UnknownHostException ex)
		{
            System.out.println("Server not found: " + ex.getMessage());
        } 
		catch (IOException ex) 
		{
            System.out.println("I/O error: " + ex.getMessage());
        }
    }

	

	
		
}

