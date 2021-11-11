package com.bridgelabz.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMaxOfThree {
	@Test
	public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue1() {
		float finalResult = MaxOfThreeFloat.getmaximum(9.6f, 1.4f, 4.4f);
		Assert.assertEquals(9.6f, finalResult, 0.0);
	}

	@Test
	public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue2() {
		float finalResult = MaxOfThreeFloat.getmaximum(1.4f, 9.6f, 4.4f);
		Assert.assertEquals(9.6f, finalResult, 0.0);
	}

	@Test
	public void given3FloatValues_WhenGetMaximum_ShouldReturnCorrectValue3() {
		float finalResult = MaxOfThreeFloat.getmaximum(9.6f, 1.4f, 4.4f);
		Assert.assertEquals(9.6f, finalResult, 0.0);
	}
}