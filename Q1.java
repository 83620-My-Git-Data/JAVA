import java.util.Scanner;

public class Q1 {
       
	 public static void main(String[] args) {
		 
      int num;
      System.out.println("Enter the number : ");
      
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
   
    		  
      String binary = Integer.toBinaryString(num);
      String octal = Integer.toOctalString(num);
      String hexadecimal = Integer.toHexString(num);
      
      System.out.println("Octal equivalent : "+octal);
      System.out.println("Binary equivalent : "+binary);
      System.out.println("Hexadecimal  equivaalent : "+ hexadecimal);
     
		
	}
}