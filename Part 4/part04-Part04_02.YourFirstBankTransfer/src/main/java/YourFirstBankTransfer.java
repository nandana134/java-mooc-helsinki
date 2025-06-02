
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account newAccount1 = new Account("Matthews account",1000.0);
        Account newAccount2 = new Account("My account",0);
        
        newAccount1.withdrawal(100.0);
        newAccount2.deposit(100.0);
        
        System.out.println(newAccount1 + "\n" +newAccount2);
        
    }
}

 
        
   