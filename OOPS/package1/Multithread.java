package package1;

class StartExp1 extends Thread  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");    
        System.out.println(Thread.currentThread().getName()); 
        for(int i=1;i<5;i++)  
    	{   
        	try  
        	{  
        		  
        	Thread.sleep(500);  
        	}catch(InterruptedException e){System.out.println(e);}    
        	System.out.println(i);    
    	}   
    }
}
class StartExp2  implements Runnable  
{    
    public void run()  
    {    
        System.out.println("Runnable thread is running...");    
    }  
}

public class Multithread {
	public static void main(String args[])  
    {    
        StartExp1 t1=new StartExp1();    
        t1.start(); 
        t1.run(); 
        StartExp1 t3=new StartExp1();
        t3.start(); 
        StartExp2  m1=new StartExp2 ();    
        Thread t2 =new Thread(m1);    
        t2.start();  
    }    
}
