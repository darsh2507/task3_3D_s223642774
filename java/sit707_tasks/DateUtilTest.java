package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S223642774";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Darsh Patel";
		Assert.assertNotNull("Student name is null", studentName);
	}
//
//	 	@Test
//	    public void testIncrement_Day_D1() {
//	        DateUtil date = new DateUtil(28, 1, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next day should be 29", 29, date.getDay());
//	    }
//	 
//	    @Test
//	    public void testdecrement_Day_D1() {
//	        DateUtil date = new DateUtil(28, 1, 2024);
//	        date.decrement();
//	        Assert.assertEquals("Expected next day should be 29", 27, date.getDay());
//	    }
//	
//	    @Test
//	    public void testIncrement_Day_D2() {
//	        DateUtil date = new DateUtil(29, 1, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next day should be 30", 30, date.getDay());
//	    }
//	    
//	    @Test
//	    public void testDecrement_Day_D2() {
//	        DateUtil date = new DateUtil(29, 1, 2024);
//	        date.decrement();
//	        Assert.assertEquals("Expected next day should be 30", 28, date.getDay());
//	    }
//	   
//	    @Test
//	    public void testIncrement_Day_D3() {
//	        DateUtil date = new DateUtil(30, 1, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next day should be 31", 31, date.getDay());
//	    }
//	    @Test
//	    public void testDecrement_Day_D3() {
//	        DateUtil date = new DateUtil(30, 1, 2024);
//	        date.decrement();
//	        Assert.assertEquals("Expected next day should be 31", 29, date.getDay());
//	    }
//
//	    @Test
//	    public void testIncrement_Day_D4() {
//	        DateUtil date = new DateUtil(31, 1, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next day should be 1", 1, date.getDay());
//	    }
//	    
//	    @Test
//	    public void testDecrement_Day_D4() {
//	        DateUtil date = new DateUtil(31, 1, 2024);
//	        date.decrement();
//	        Assert.assertEquals("Expected next day should be 1", 30, date.getDay());
//	    }
//	    
//
//	    @Test
//	    public void testIncrement_Month_M1() {
//	        DateUtil date = new DateUtil(30, 4, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next month should be May", 5, date.getMonth());
//	    }
//	    @Test
//	    public void testDecrement_Month_M1() {
//	        DateUtil date = new DateUtil(30, 4, 2024);
//	        date.decrement();
//	        Assert.assertEquals("Expected next month should be May", 4, date.getMonth());
//	    }
//	    
//	    @Test
//	    public void testIncrement_Month_M2() {
//	        DateUtil date = new DateUtil(31, 1, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next month should be February", 2, date.getMonth());
//	    }
//	    
//	    @Test
//	    public void testIncrement_Month_M3() {
//	        DateUtil date = new DateUtil(28, 2, 2023);
//	        date.increment();
//	        Assert.assertEquals("Expected next month should be March", 3, date.getMonth());
//	    }
//	   
//	    @Test
//	    public void testIncrement_Month_M4() {
//	        DateUtil date = new DateUtil(28, 2, 2024);
//	        date.increment();
//	        Assert.assertEquals("Expected next month should be February", 2, date.getMonth());
//	    }
//	    
//	    @Test
//	    public void testIncrement_Year_Y1() {
//	        DateUtil date = new DateUtil(28, 2, 2020);
//	        date.increment();
//	        Assert.assertEquals("Expected next year should be 2020", 2020, date.getYear());
//	    } 
//	    
//	    
//	    @Test
//	    public void testIncrement_Year_Y2() {
//	    	DateUtil date = new DateUtil(28, 2, 2023); 
//	    	date.increment(); 
//	    	Assert.assertEquals("Expected next year should be 2024", 2024, date.getYear());
//	    }
	    
	// Test cases for adding days
    @Test
    public void testAddDays_D1() {
        DateUtil date = new DateUtil(15, 6, 2023);
        for (int i = 0; i < 10; i++) {
            date.increment();
        }
        Assert.assertEquals(25, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    @Test
    public void testAddDays_D2() {
        DateUtil date = new DateUtil(28, 2, 2023);
        for (int i = 0; i < 3; i++) {
            date.increment();
        }
        Assert.assertEquals(3, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testAddDays_D3() {
        DateUtil date = new DateUtil(31, 1, 2023);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    @Test
    public void testSubtractDays_D1() {
        DateUtil date = new DateUtil(15, 6, 2023);
        for (int i = 0; i < 10; i++) {
            date.decrement();
        }
        Assert.assertEquals(5, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    
    // Test Cases for subtracting days

    @Test
    public void testSubtractDays_D2() {
        DateUtil date = new DateUtil(1, 3, 2023);
        date.decrement();
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testSubtractDays_D3() {
        DateUtil date = new DateUtil(1, 1, 2023);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2022, date.getYear());
    }

// Test case for adding weeks
    
    @Test
    public void testAddWeeks_OP3() {
        DateUtil date = new DateUtil(15, 6, 2023);
        for (int i = 0; i < 14; i++) {
            date.increment();
        }
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    // Test case for subtracting weeks 
    @Test
    public void testSubtractWeeks_OP4() {
        DateUtil date = new DateUtil(15, 6, 2023);
        for (int i = 0; i < 14; i++) {
            date.decrement();
        }
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    
    @Test
    public void testAddMonths_M1_OP5() {
        DateUtil date = new DateUtil(30, 4, 2023);
        for (int i = 0; i < 30; i++) {
            date.increment();
        }
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testAddMonths_M2_OP5() {
        DateUtil date = new DateUtil(31, 1, 2023);
        for (int i = 0; i < 28; i++) {
            date.increment();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    @Test
    public void testAddMonths_M3_OP5() {
        DateUtil date = new DateUtil(28, 2, 2023);
        for (int i = 0; i < 28; i++) {
            date.increment();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    @Test
    public void testAddMonths_M4_Y1_OP5() {
        DateUtil date = new DateUtil(29, 2, 2024);
        for (int i = 0; i < 29; i++) {
            date.increment();
        }
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
  // Test cases for subtracting months

    @Test
    public void testSubtractMonths_M2_OP6() {
        DateUtil date = new DateUtil(31, 3, 2023);
        for (int i = 0; i < 31; i++) {
            date.decrement();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testSubtractMonths_M3_OP6() {
        DateUtil date = new DateUtil(28, 3, 2023);
        for (int i = 0; i < 28; i++) {
            date.decrement();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    @Test
    public void testSubtractMonths_M4_Y1_OP6() {
        DateUtil date = new DateUtil(29, 3, 2024);
        for (int i = 0; i < 29; i++) {
            date.decrement();
        }
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
// Test cases for adding Years
    @Test
    public void testAddYears_Y1_OP7() {
        DateUtil date = new DateUtil(29, 2, 2024);
        for (int i = 0; i < 366; i++) {
            date.increment();
        }
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2025, date.getYear());
    }

    @Test
    public void testAddYears_Y2_OP7() {
        DateUtil date = new DateUtil(28, 2, 2023);
        for (int i = 0; i < 365; i++) {
            date.increment();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    @Test
    public void testSubtractYears_Y1_OP8() {
        DateUtil date = new DateUtil(29, 2, 2024);
        for (int i = 0; i < 366; i++) {
            date.decrement();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    @Test
    public void testSubtractYears_Y2_OP8() {
        DateUtil date = new DateUtil(28, 2, 2023);
        for (int i = 0; i < 365; i++) {
            date.decrement();
        }
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2022, date.getYear());
    }

}
