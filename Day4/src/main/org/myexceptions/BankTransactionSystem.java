package org.myexceptions;
//10. Bank Transaction System (Checked + Custom Exception)
//💡 Problem Statement:
//Develop a Bank Account System where:
//withdraw(double amount) method:
//Throws InsufficientBalanceException if withdrawal amount exceeds balance.
//Throws IllegalArgumentException if the amount is negative.
//Handle exceptions in main().
//Expected Behavior:
//        If valid, print "Withdrawal successful, new balance: X".
//If balance is insufficient, throw and handle "Insufficient balance!".
//If the amount is negative, throw and handle "Invalid amount!".
class InsufficientBalanceException  extends Exception{
    InsufficientBalanceException(String s){
        super(s);
    }
}
public class BankTransactionSystem {
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    void withdraw(double ammount) throws InsufficientBalanceException {
        if (ammount>getBalance()){
//            Throws InsufficientBalanceException if withdrawal amount exceeds balance.
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if (ammount<0){
            //Throws IllegalArgumentException if the amount is negative.
            throw new IllegalArgumentException("Invalid amount!");
        }
        setBalance(getBalance()-ammount);
        //        If valid, print "Withdrawal successful, new balance: X".
        System.out.println("Withdrawal successful, new balance: "+ this.getBalance());
    }
    public static void main(String[] args) {
        BankTransactionSystem bkc = new BankTransactionSystem();
        try {
            bkc.setBalance(150.6);
            bkc.withdraw(-190.3);
        } catch (InsufficientBalanceException e) {
            System.out.println("withdrawal amount exceeds balance.");
        } catch (IllegalArgumentException e){
            System.out.println("the amount is negative.");
        }
    }
}
