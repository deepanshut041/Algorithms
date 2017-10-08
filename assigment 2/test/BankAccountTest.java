import org.junit.Assert;
import org.junit.Test;


public class BankAccountTest{
    BankAccount account;

    @Before
    public void testDeposit(){
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