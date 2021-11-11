package com.bridgelabz.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMaxOfThree {
	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		String finalResult =MaxOfThreeString.getmaximum("apple", "peach", "banana");
		Assert.assertEquals("peach", finalResult);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		String finalResult = MaxOfThreeString.getmaximum("apple", "peach", "banana");
		Assert.assertEquals("peach", finalResult);
	}

	@Test
	public void given3StringValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		String finalResult =MaxOfThreeString.getmaximum("apple", "peach", "banana");
		Assert.assertEquals("peach", finalResult);
	}
}