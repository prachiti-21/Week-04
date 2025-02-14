import java.util.*;
 class InsufficientBalanceException extends Exception {
     public InsufficientBalanceException(String message) {
         super(message);
     }
 }

   public class BankTransaction{
       public static double withdraw(double amount,double balance) throws InsufficientBalanceException {

           balance = balance - amount;


           if (balance < amount) {
               throw new InsufficientBalanceException("Insufficient balance!");
           }
           else if(amount<0){
               throw new IllegalArgumentException("Invalid amount!");
           }
           else{

               System.out.println("Withdrawal successful, new balance: "+balance);
           }
           return balance;
       }

       public static void main(String[] args) {

           try{
               System.out.println(withdraw(-200,2000));
           }
           catch (Exception e){
               System.out.println(e.getMessage());
           }
       }
   }



