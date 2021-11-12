package com.bridgelabz.generics;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestGenerics {

	@Test
	void testTheLargestFromTheGivenThreeInteger() {
		Generics <Integer> obj=new Generics  <Integer>(3,4,6);
		int result = Generics.testMaximum(3,4,6);
		Assert.assertEquals(6, result);
	}


@Test
void testTheLargestFromTheGivenThreeFloatValues() {
	Generics <Float> obj=new Generics  <Float>(3.1f,4.2f,6.3f);
	float result = Generics.testMaximum(3.1f,4.2f,6.3f);
	Assert.assertEquals(6.3f, result);
}
@Test
void testTheLargestFromTheGivenThreeStringValues() {
	Generics <String> obj=new Generics  <String>("Apple","Banana","Mango");
	String result = Generics.testMaximum("Apple","Banana","Mango");
	Assert.assertEquals("Mango", result);
}

}