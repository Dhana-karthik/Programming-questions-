import java.util.*;
public class Main {
    public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
customerBankAccount[] customerObject = new customerBankAccount[10];
boolean loop = true;
int choice;
// opening an account
for(int i=0;i<4;i++) {
    customerObject[i] = new customerBankAccount();
    customerObject[i].CustomerId.add(i);
}
customerObject[0].pinNumber.add(0,492001);
customerObject[0].MainBalance.add(0,3000.00);


     while(loop){
         System.out.println("1. Deposit \n2. Withdraw\n3. Transfer \n4. Exit\n");
       choice = sc.nextInt();

         switch(choice){
             case 1:
             {
                 System.out.println("enter your bank account number ");
                 int accountno = sc.nextInt();
                 if(accountno > customerObject.length){
                     System.out.println("you entered invalid account number ");
                 }

                 for(int i =0;i<customerObject.length;i++){
                     System.out.println("enter the pin number ");
                     // kept here so if possword invalid we can enter it again
                     int pinNumber = sc.nextInt();



                     if(customerObject[i].CustomerId.get(0)  == accountno && customerObject[i].pinNumber.get(0)== pinNumber ){
                         System.out.println("enter the amnt you want to deposit ");
                         double depositAmount = sc.nextDouble();
                         customerBankAccount.cashDeposit(customerObject[i],accountno,depositAmount );

                         break;
                     } else if (customerObject[i].CustomerId.get(0)  == accountno && customerObject[i].pinNumber.get(0)!= pinNumber ) {
                         System.out.println("invalid password enter again \n ");
                         i--;

                     } else  if(customerObject[i].CustomerId.get(0)  != accountno && i== customerObject.length-1){
                         System.out.println("your acoount is not found ");
                     }

                 }


                 break;
             }
             case 2:
             {
                 System.out.println("enter your bank account number ");
                 int accountno = sc.nextInt();
                 if(accountno > customerObject.length){
                     System.out.println("you entered invalid account number ");
                 }
                 System.out.println("enter your pin number");


                 for(int i =0;i<customerObject.length;i++){

                     int pinNumber = sc.nextInt();
                     if(customerObject[i].CustomerId.get(0)  == accountno && customerObject[i].pinNumber.get(0)== pinNumber ){
                         System.out.println("enter the amount to withdraw");
                         double withdrawAmt=sc.nextDouble();
                         customerBankAccount.withDrawimngMoney(customerObject[i], withdrawAmt);
                        // System.out.println("Your Main balance is :"+customerObject[i].MainBalance.get(0));
                      break;
                     } else if (customerObject[i].CustomerId.get(0)  == accountno && customerObject[i].pinNumber.get(0)!= pinNumber)
                     {
                         System.out.println("Invalid password enter again \n ");
                         i--;
                     } else  if(customerObject[i].CustomerId.get(0)  != accountno && i== customerObject.length-1)
                     {
                         System.out.println("your account is not found ");
                     }

                 }
             break;
             }



             case 3:
             {

                 System.out.println("enter your bank account number ");
                 int accountno = sc.nextInt();
                 if(accountno > customerObject.length){
                     System.out.println("you entered invalid account number ");
                 }

                 for(int i =0;i<customerObject.length;i++){

                     int pinNumber = sc.nextInt();

                     if(customerObject[i].CustomerId.get(0)  == accountno && customerObject[i].pinNumber.get(0)== pinNumber ) {
                         System.out.println("enter the amount to reciever account no");
                         int reciverAccountNo = sc.nextInt();
                         double moneyToSend=sc.nextDouble();

                         for(int j =0;j<customerObject.length;j++) {

                          if(customerObject[j].CustomerId.get(0)==reciverAccountNo) customerBankAccount.MoneyTransfer(moneyToSend, customerObject[i], accountno,customerObject[j], reciverAccountNo);
                         }

                         System.out.println("Your Main balance is :"+customerObject[i].MainBalance.get(0));
                         break;
                     } else if (customerObject[i].CustomerId.get(0)  == accountno && customerObject[i].pinNumber.get(0)!= pinNumber)
                     {
                         System.out.println("Invalid password enter again \n ");
                         i--;
                     } else  if(customerObject[i].CustomerId.get(0)  != accountno && i== customerObject.length-1)
                     {
                         System.out.println("your account is not found ");
                     }

                 }







                 break;
             }
             default:
             {   loop =false;
                 break;
             }
         }



     }



    }
}
