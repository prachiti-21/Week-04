public class CalculateInterest {
    public static double calculateInterest(double amount,double rate,int years) throws IllegalArgumentException{
        if(amount<0 || rate<0) {
           throw new IllegalArgumentException(("Invalid input: Amount and rate must be positive"));

        }
        return (amount*rate*years)/100;
    }

    public static void main(String[] args) {

        try{

            System.out.println(calculateInterest(1000,2,2));

        }
        catch (Exception e){
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
