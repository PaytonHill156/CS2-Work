package WeekThree;

import static org.junit.Assert.assertNotEquals;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ShuffleRowsTest {

	@Test
	void testShuffle() {
		
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		int[][] actual = ShuffleRows.shuffle(m);
		
		assertNotEquals("Matrix did not shuffle", Arrays.asList(m), Arrays.asList(actual));
	}

}
