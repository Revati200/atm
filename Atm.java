import java.util.Scanner;

public class Atm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int balance=50000, deposit,withraw;
        while(true){
            System.out.println("Welcome in your ATM");
            System.out.println("Choose 1 for deposit: ");
            System.out.println("Choose 2 for withdraw: ");
            System.out.println("Choose 3 for balance inquiry: ");
            System.out.println("Choose 4 for exit: ");
            int choice =sc.nextInt();
            int withdraw;
            switch(choice){
             case 1: 
             System.out.println("Enter amount you want to deposit");
             deposit=sc.nextInt();
             balance=balance + deposit;
             System.out.println("Your update balance is: "+balance);
             System.out.println();
             break;
             
             case 2:
             System.out.println("Enter amount to withdraw: ");
             withdraw =sc.nextInt();
             if(balance >= withdraw){
                balance =balance-withdraw;
            }else{
               System.out.println("Insufficient fund...!");
            }
            System.out.println();
            break;

            case 3:
            System.out.println("Your account balance is: "+balance);
            System.out.println();
            break;

            case 4:
            System.exit(0);
            }
        }
    }
}