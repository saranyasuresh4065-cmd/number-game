import java.util.*;
class BankAccount {
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited successfully!");
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Amount withdraw successfully!");
        }
        else{
            System.out.println("Insufficiant balanced!");
        }
    }
    void checkBalance()
    {
        System.out.println("Current Balance:"+balance);
    }
}
public class ATM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount a=new BankAccount(1000);
        int choice;
        do{
            System.out.println("\n.....ATM MENU.....");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter amount to deposit:");
                    double dep=sc.nextDouble();
                    a.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double wit=sc.nextDouble();
                    a.withdraw(wit);
                    break;
                case 3:
                    a.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank yoou for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");    
            }
        }
        while(choice!=4);
    }
}
