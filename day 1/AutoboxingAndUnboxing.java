class AutoboxingAndUnboxing 
{ 
    public static void main (String[] args) 
    { 
        // creating an Integer Object 
        // with value 10. 
        Integer i = new Integer(10); 
  
        // unboxing the Object 
        int i1 = i; 
  
        System.out.println("Value of i: " + i); 
        System.out.println("Value of i1: " + i1); 
  
        //Autoboxing of char 
        Character ch = 'a'; 
  
        // Auto-unboxing of Character 
        char ch1 = ch; 
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of ch1: " + ch1); 
  
    } 
}