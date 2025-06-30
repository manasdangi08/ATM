import java.util.*;
public class atm{
    public static void main(String[] args) {
        double availabalBlance = 10000;
        double depositAmount = 0;
        double WithdrawAmount =0;
        double availabalBlancenet =0 ;
        double WithdrawAmountnet =0 ;
        System.out.print("ENTER THE ATM NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int atmNumber = sc.nextInt();
         System.out.print("ENTER THE PIN : ");
        int  pin = sc.nextInt();
        if (atmNumber==pin) {
            System.out.println("1.Check Availabal Balance");
            System.out.println("2.Withdrawl Amount");
            System.out.println("3.Deposit Amount ");
            System.out.println("4.Exit");
            System.out.print("Enter Your Choice : ");
            
        }else {
            System.out.println("You Entered a Wrong Pin ");
        }
            int button = sc.nextInt();
                switch (button) {
            case 1:
                System.out.println("Available Balance is 10000");
                break;
                case 2:
                System.out.print("Enter the Amount you want to withdrawl : ");
                double withdrawlAmount = sc.nextDouble();
                availabalBlance = (availabalBlance - withdrawlAmount); 
                System.out.println("Available balnce is : "  + availabalBlance);
                break;
                     case 3:
                     System.out.print("Enter the Amount you want to  deposit :");
                        depositAmount = sc.nextInt();
                        availabalBlancenet = depositAmount + availabalBlance;
                        System.out.println("Available balnce is : " + availabalBlancenet );
                    
                break;
                case 4:
                System.out.println("Collect your card \n123Thank you for using your ATM Machine: "); 
                break;
            default:
            System.out.println("Please enter a valid Input : ");
                break;
        } 

    }
}