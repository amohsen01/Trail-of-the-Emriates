import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class Swiper extends Characters{

	public Swiper() {
		super("Swiper", "Im Geting The Urge To Steal ! Hide Your Item Before I Steal It.");
		// TODO Auto-generated constructor stub
	}

	
private String str = "";
TimerTask task = new TimerTask()
{
    public void run()
    {
        if( str.equals("") )
        {
            System.out.println( "You Have 10 seconds To Stop Swiper From Stealing From You By Typing Hide " );
            System.exit( 0 );
        }
    }    
};

	 public void getInput() throws Exception
	    {
	        Timer timer = new Timer();
	        timer.schedule( task, 10*1000 );

	        System.out.println( "Your 10 seconds To Hide Starts Now !! Quickly Type The Word Hide To Stay Safe From Swiper " );
	        BufferedReader in = new BufferedReader(
	        		
	        new InputStreamReader( System.in ) );
	        str = in.readLine();

	        timer.cancel();
	    
	        if (str.equals("Hide"))
	        {
	        	
	        System.out.println("You Are Safe From Swiper !");	
	        }
	        
	        else 
	        {
	      	
	        	 System.out.println("Oh Ooo Swiper Got You And Stole Your Item Away !!!");
	        }
	        
	        
	        try
	        {
	            (new Swiper()).getInput();
	        }
	        catch( Exception e )
	        {
	            System.out.println( e );
	        }
	  
	    }

	@Override
	public void talk ()
	{
		System.out.println(conversation);
	}
}
