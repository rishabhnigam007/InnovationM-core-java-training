class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    }
} 
  
// A Class that uses above MyException 
class UserGenerateException
{ 
    // Driver Program 
    public static void main(String args[]) 
    { 
        try
        { 
            // Throw an object of user defined exception 
            throw new MyException("rishabh exception !!"); 
        } 
        catch(MyException ex) 
        { 
            System.out.println("cought"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
    } 
}