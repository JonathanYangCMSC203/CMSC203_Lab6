//Author: Jonathan Yang
//Lab 6- JUnit Test

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author yangj
 *
 */
class GradebookTester {

	/**
	 * @throws java.lang.Exception
	 */
	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(100);
		g1.addScore(90);
		/*g1.addScore(80);
		g1.addScore(70);
		g1.addScore(60);*/
		g2.addScore(99);
		g2.addScore(88);
		/*g2.addScore(76);
		g2.addScore(95);
		g2.addScore(96);*/
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	/**
	 * Test method for {@link GradeBook#addScore(double)}.
	 */
	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("100.0 90.0 "));
		assertTrue(g2.toString().equals("99.0 88.0 "));
	}

	/**
	 * Test method for {@link GradeBook#sum()}.
	 */
	@Test
	void testSum() {
		assertEquals(190, g1.sum(), .0001);
		assertEquals(187, g2.sum(), .0001);
	}

	/**
	 * Test method for {@link GradeBook#minimum()}.
	 */
	@Test
	void testMinimum() {
		assertEquals(90, g1.minimum(), .00001);
		assertEquals(88, g2.minimum(), .00001);
	}

	/**
	 * Test method for {@link GradeBook#finalScore()}.
	 */
	@Test
	void testFinalScore() {
		assertEquals(100, g1.finalScore(), .0001);
		assertEquals(99, g2.finalScore(), .0001);
	}

	/**
	 * Test method for {@link GradeBook#getScoreSize()}.
	 */
	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize(), .0001);
		assertEquals(2, g2.getScoreSize(), .0001);
	}

	/**
	 * Test method for {@link GradeBook#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("100.0 90.0 ", g1.toString());
		assertEquals("99.0 88.0 ", g2.toString());
	}

}
