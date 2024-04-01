package task;

public class ExceptionHandling 
{
	 public static void main(String[] args) 
	 {  
	        try  
	        {  
	        int data = 50/0; //throws exception   
	        }  
	        // handling the exception  
	        catch(Exception e)  
	        { 
	        	System.out.println(e);
	        }
	        {
	            System.out.println("Cannot divided by zero");  
	        }  
}  
}	      

