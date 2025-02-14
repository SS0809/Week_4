package org.myexceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionSystemTest {
    @Test
    void test1() {
        BankTransactionSystem bkc = new BankTransactionSystem();
        bkc.setBalance(150.6);
        assertThrows(IllegalArgumentException.class,() ->{
            bkc.withdraw(-190.3);
        });
    }
    @Test
    void test2(){
        BankTransactionSystem bkc = new BankTransactionSystem();
        bkc.setBalance(150.6);
        assertThrows(InsufficientBalanceException.class,() ->{
            bkc.withdraw(890.3);
        });
    }
}