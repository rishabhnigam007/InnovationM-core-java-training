import java.util.Scanner; 
class JavaScanner 
{ 
    public static void main(String[] args) 
    { 
        // Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
        // String input 
	System.out.println("enter name :");
        String name = sc.nextLine(); 
        // Character input 
	System.out.println("enter gender :");
        char gender = sc.next().charAt(0); 
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
	System.out.println("enter age :");
        int age = sc.nextInt(); 
	System.out.println("enter mobile no. :");
        long mobileNo = sc.nextLong(); 
	System.out.println("enter cgpa :");
        double cgpa = sc.nextDouble(); 
        // Print the values to check if the input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
    } 
} 