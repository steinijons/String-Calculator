package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest {

	//test1
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	//test2
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	//test3
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	//test4
	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

	/*@Test(expected = RuntimeException.class)
    public void negativeException() {
        Calculator.add("-1,2,3,-4");
    }*/

    //test5
    /*@Test
    public final void negativeThrown() {
        RuntimeException exception = null;
        try {
                Calculator.add("1");
        } catch (RuntimeException e) {
            exception = e;
        }
        //assertNotNull(exception);
        assertEquals("Negatives not allowed: []", exception.getMessage());
    }  */

    //test6
	 @Test
        public void testIllegalNumBiggerThan1000(){
                assertEquals(2, Calculator.add("1001,2"));
    }

    //test7
    @Test
    public void testDelimeterGiven(){
    	assertEquals(3, Calculator.add("//;\n1;2"));
    }
}