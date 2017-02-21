package consec;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ConsecTest {

	@Test
	public void consecTestRuns() {
		
		int[] testArray = {1, 2, 3, 5, 10, 9, 8, 9, 10, 11, 7};	    
		
		assertEquals("[0, 4, 6, 7]", ConsecNums.findConsecutiveRuns(testArray));

}
	
}
