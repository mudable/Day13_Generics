package com.bridgelabz.generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMaxOfThreeNum {

	@Test
	public void checkmaximum1() {
		int max = MaxOfThreeInteger.getmaximum(9, 4, 1);
		Assert.assertEquals(9, max);
	}

	@Test
	public void checkmaximum2() {
		int max = MaxOfThreeInteger.getmaximum(1, 9, 4);
		Assert.assertEquals(9, max);
	}

	@Test
	public void checkmaximum3() {
		int max = MaxOfThreeInteger.getmaximum(1, 4, 9);
		Assert.assertEquals(9, max);
	}
}