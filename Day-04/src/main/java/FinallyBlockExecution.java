import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        try{
            Scanner input= new Scanner(System.in);
            int num1,num2;
            System.out.println("Enter two numbers: ");
            num1=input.nextInt();
            num2=input.nextInt();
            int ans=num1/num2;
            System.out.println("Division of the numbers is: "+ans);
        }
        catch (ArithmeticException e){
            System.out.println("Exception caught when number divided by 0");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
