import java.util.Scanner;
public class currency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose Base currency:");
        System.out.println("1.USD");
        System.out.println("2.INR");
        int base=sc.nextInt();
        System.out.println("Choose Target currency:");
        System.out.println("1.USD");
        System.out.println("2.INR");
        int target=sc.nextInt();
        System.out.println("Enter amount:");
        double amount=sc.nextDouble();
        double result=0;
        if(base==1 && target==2){
            result=amount*83;
            System.out.println("Converted amount=₹"+result);
        }
        else if(base==2 && target==1){
            result=amount/83;
            System.out.println("Converted amount:₹"+result);
        }
        else {
            System.out.println("Same currency selected!");
        }
    }
}
