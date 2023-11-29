import java.util.*;

public class customerBankAccount {
     List<Integer> CustomerId = new ArrayList<>();
    List<Double > MainBalance = new LinkedList<>();
    List<Integer> pinNumber = new ArrayList<>();


   static void cashDeposit(customerBankAccount object ,int customerId, double depositAmount ){
      double initialBalance=  object.MainBalance.get(0);
      object.CustomerId.add(customerId);
        object.MainBalance.set(0,initialBalance+depositAmount);
       System.out.println(" Your Main balance is :"+object.MainBalance.get(0));
    }
   static void  withDrawimngMoney(customerBankAccount object , double withdrawlAmount){
        double initialbalance = object.MainBalance.get(0);
        if(initialbalance-withdrawlAmount>=1000) {
            object.MainBalance.set(0, initialbalance - withdrawlAmount);
            System.out.println(" Your Main balance is :"+object.MainBalance.get(0));
        }else{
            System.out.println("the minimum balance should be 1000 . So, you can withdraw   "+(initialbalance-1000.00)+"   Rupees maximum ");
        }
    }
   static void MoneyTransfer(double amountToTransfer, customerBankAccount senderobject,int senderId , customerBankAccount reciverObject, int reciverId ){

        double sendermoney = senderobject.MainBalance.get(senderId);
        senderobject.MainBalance.set(senderId,sendermoney-amountToTransfer);

        double reciverIntialBalance = reciverObject.MainBalance.get(reciverId);
        reciverObject.MainBalance.set(reciverId,reciverIntialBalance+amountToTransfer);

    }

}
