package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJenkinsCalculator {

	@Test
	public void testSumNumber() {
		JenkinsCalculator obj = new JenkinsCalculator();
		assertEquals(20, obj.sumNumber(10, 10));
	}
	
	@Test
	public void testSubtractNumber() {
		JenkinsCalculator obj = new JenkinsCalculator();
		assertEquals(5, obj.subtractNumber(10, 5));
	}

}
