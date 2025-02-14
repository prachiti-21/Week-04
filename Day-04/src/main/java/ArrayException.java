import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        try{
            Scanner input=new Scanner(System.in);
            int n;
            System.out.println("Enter length of array: ");
            n=input.nextInt();

            int[] arr=new int[n];
            System.out.println("Enter elements of array:");
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            System.out.println("Enter index to retrieve the element of that index: ");
            int i=input.nextInt();
            System.out.println("Value at index "+i+" is "+arr[i]);
        }
        //ArrayIndexOutOfBoundException
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        //nullpointer exception
        try{
            int[]arr=null;
            System.out.println(arr.length);
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
