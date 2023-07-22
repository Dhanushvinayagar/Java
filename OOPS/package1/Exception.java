package package1;

//throws IOException
public class Exception {
	public static void main(String args[]){
	     
	     try {
			int a=1/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
        try {  
              
                try {  
                    int arr[] = { 1, 2, 3, 4 };  
                    System.out.println(arr[10]);  
                }  
                catch (ArithmeticException e) {  
                    System.out.println("Arithmetic exception inner try block ");  
                }  
            }  
    
            // to handle ArithmeticException   
           
        catch (ArrayIndexOutOfBoundsException e4) {  
            System.out.println(e4+"outer (main) try block");  
        }  
       
		finally {
			System.out.print("Finally");
		}
		
		
	}
}
