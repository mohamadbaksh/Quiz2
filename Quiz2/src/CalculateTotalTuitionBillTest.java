import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTotalTuitionBillTest {

	@Test
	public void testTotalTuition() {
		CalculateTotalTuitionBill total = new CalculateTotalTuitionBill();
		double Result = total.TotalTuition(12500, 0, 0, 0);
		double ResultB = total.TotalTuition(12500,1 , 1, 1);
		assertEquals(50000,Result);
		assertEquals(50755.0125,ResultB);


	}

	@Test
	public void testMonthlyBill() {
		CalculateTotalTuitionBill bill = new CalculateTotalTuitionBill();
		double Result = bill.MonthlyBill(50000, 0);
		double ResultB = bill.MonthlyBill(50755.0125, 1);
		assertEquals(1041.67,Result);
		assertEquals(1067.97,ResultB);
		
	}

}
