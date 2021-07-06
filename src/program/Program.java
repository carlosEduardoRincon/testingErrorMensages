
package program;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws BusinessException {
       Scanner sc = new Scanner(System.in);
      
       System.out.println("Enter account data: ");
       
       System.out.printf("Number: ");
       int num = sc.nextInt();
       System.out.printf("Holder: ");
       sc.next();
       String holder= sc.nextLine();
       System.out.printf("Initial balance: ");
       double balance = sc.nextDouble();
       System.out.printf("Withdraw limit: ");
       double withDrawL = sc.nextDouble();
       Account c1 = new Account(num, holder, balance, withDrawL);
       
       System.out.println("");
       
       System.out.printf("Enter amount for withdraw: ");
       double amount = sc.nextDouble();
       try {
           c1.withdraw(amount);
           System.out.printf("New balace: %.2f\n", c1.getBalance());
       }
       catch (BusinessException e){
           System.out.println(e.getMessage());
       }
           
       sc.close();
      
    }
    
}
