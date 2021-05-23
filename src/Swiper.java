import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class Swiper extends Characters{
Context c=new Context();
	public Swiper() {
		super("Swiper", "Im Geting The Urge To Steal ! Hide Your Item Before I Steal It.");
		// TODO Auto-generated constructor stub
	}
	public Swiper(Context c) {
		super("Swiper", "Im Geting The Urge To Steal ! Hide Your Item Before I Steal It.");
		// TODO Auto-generated constructor stub
		this.c=c;
	}

	
private String str = "";
TimerTask task = new TimerTask()
{
    public void run()
    {
        if( str.equals("") )
        {
            System.out.println("Oh Ooo Swiper Got You And Stole Your Item Away !!!" );
            c.setSad();
            task.cancel();
        }
    }    
};

	 public void getInput() throws Exception
	    {
	        Timer timer = new Timer();
	        timer.schedule( task, 10*1000 );

	        System.out.println( "Your 10 seconds To Hide Starts Now !! Quickly Type The Word Hide To Stay Safe From Swiper " );
	        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
	        str = in.readLine();

	      
	       
	        if (str.contains("Hide"))
	        {
	        	
	        System.out.println("You Are Safe From Swiper!");	
	        c.setHappy();
	        timer.cancel();
	        }
	        else
	        {
	            task.cancel();
	        }
	        
	    
	       
	  
	    }

	@Override
	public void talk ()
	{
		System.out.println(conversation);
	}
}
