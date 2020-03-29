package com.pp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytt {
	@Test
	public void m1() {
		System.out.println("addition:");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("result:"+c);
		Assert.assertEquals(c, 30);
	}

}
