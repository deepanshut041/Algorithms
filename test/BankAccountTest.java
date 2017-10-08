import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BankAccountTest{
    BankAccount account;

    @Before
    public void setUp(){
        account = new BankAccount("default");
    }

    @Test
    public void testDeposit(){
        assertEquals(27, account.balance, 0.1);
        account.deposit(1);
        assertEquals(28, account.balance, 0.1);
    }

    @Test
    public void testOwner1(){
        assertEquals(account, new BankAccount("default"));
    }

    @Test
    public void testOwner2(){
        assertTrue(account == new BankAccount("default"));
    }

    @Test
    public void testOwner3(){
        assertTrue(account.equals( new BankAccount("default")));
    }
}