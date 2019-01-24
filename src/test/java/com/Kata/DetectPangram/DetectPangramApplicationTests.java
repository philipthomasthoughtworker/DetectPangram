package com.Kata.DetectPangram;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DetectPangramApplicationTests {

	@Test
	public void check_test_1() {
		boolean results = DetectPangramApplication.check("The quick brown fox jumps over the lazy dog.");

		assertTrue(results);
	}

	@Test
	public void check_test_2() {
		boolean results = DetectPangramApplication.check("You shall not pass!");

		assertFalse(results);
	}

	@Test
	public void check_test_3() {
		boolean results = DetectPangramApplication.check("The quick brown fox jumps over the lazy dog.".toUpperCase());

		assertTrue(results);
	}

	@Test
	public void check_test_4() {
		boolean results = DetectPangramApplication.check("The quick brown fox jumps over the lazy dog.".toLowerCase());

		assertTrue(results);
	}
}
