package it.unibo.oop.lab.exception2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	AccountHolder a1 = new AccountHolder("Pippo", "Lino", 100);
    	AccountHolder a2 = new AccountHolder("Pappa", "Lana", 101);
    	StrictBankAccount str1 = new StrictBankAccount(a1.getUserID(), 10000, 10);
    	StrictBankAccount str2 = new StrictBankAccount(a2.getUserID(), 10000, 10);
    	
    	try {
    		str1.deposit(10,1000);
    	}
    	catch(WrongAccountHolderException e){
    		System.out.println(e);
    	}
    	try {
    		str1.withdraw(a1.getUserID(), 200000);
    	}
    	catch(NotEnoughFoundsException e){
    		System.out.println(e);
    	}
    	try {
    		str1.withdraw(a1.getUserID(), 200000);
    	}
    	catch(NotEnoughFoundsException e){
    		System.out.println(e);
    	}
    }
}
