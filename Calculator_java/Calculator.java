import java.util.*;
public class Calculator {
   public static void main(String[] args) {
      //System.out.println("Enter operator:");
      System.out.println("Enter first number");
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      System.out.println("Enter second number");
      int n2 = sc.nextInt();
      
      System.out.println("Enter operator");
      String operator = sc.next();
    switch (operator)
    {
    case "+":
    System.out.println("Sum of numbers is "+(n1+n2));
        break;
    case "-":
    System.out.println("Subtraction  of number is "+(n1-n2));
        break;
    case "*":
    System.out.println("Multiplication of number is "+(n1*n2));
        break;
    case "%":
    System.out.println("Modulo Division of number is "+(n1%n2));
        break;
    case "/":
    System.out.println("Division of number is "+(n1/n2));
        break;
    
    default:
    System.out.println("You entered invalid operator");
        
    }

   

   }

}
   
