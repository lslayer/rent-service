package tk.lslayer.rent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.lslayer.rent.model.Orders;
import tk.lslayer.rent.model.RentOrder;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OshytkyRentApplicationTests {

	@Test
	public void contextLoads() {
	}

	/*
	|May 1------May 15|
	                      |<May 17------- May 20|

	             |<May 13------- May 20|
	|May 1------May 15|
	 */

	@Test
	public void testDatesOverlap() {
		Orders orders = new Orders();
		LocalDate date1 = LocalDate.of(2015, Month.MAY, 1);
		LocalDate date2 = LocalDate.of(2015, Month.MAY, 15);
		LocalDate date3 = LocalDate.of(2015, Month.MAY, 17);
		LocalDate date4 = LocalDate.of(2015, Month.MAY, 20);
		assertFalse(orders.isOverlapping(date1, date2, date3, date4));
		assertTrue(orders.isOverlapping(date1, date3, date2, date4));
	}

}
