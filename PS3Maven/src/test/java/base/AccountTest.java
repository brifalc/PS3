package base;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void accountTest() {
		Account a = new Account(1122, 20000, 4.5, new Date());
		try {
			a.withdraw(2500);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.deposit(3000);
		
		double dExpectedBalance = 20500;
		double dActualBalance = a.getBalance();
		
		assertTrue(dExpectedBalance == dActualBalance);
		
		double dExpectedMonthlyInterest = .375;
		double dActualMonthlyInterest = a.getMonthlyInterestRate();
		
		assertTrue(dExpectedMonthlyInterest == dActualMonthlyInterest);
		
		

	}

}
