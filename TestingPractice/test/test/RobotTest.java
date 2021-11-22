package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Robot;

class RobotTest {
	private Robot sut;
	@BeforeEach
	public void setUp() {
		sut = new Robot();
	}

	@Test
	public void testReplaceMaxX() {
		sut.replace(8, 8);
		int expected = 8;
		int actual = sut.getX();
		assertEquals(expected, actual);
	}

//	@Test
//	public void testReplaceMinX() {

//	}
//
//	@Test
//	public void testMoveX() {

//	}
//
//	@Test
//	public void testMoveXOverMax() {

//	}

}