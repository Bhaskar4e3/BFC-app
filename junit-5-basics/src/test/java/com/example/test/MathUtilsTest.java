package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.AfterTestExecution;
import org.springframework.test.context.event.annotation.AfterTestMethod;

class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeAll
	static void firstall() {
		System.out.println("before start  all methods it runs");
	}
	
	@BeforeEach
	void init() {
 mathUtils	=new MathUtils();
 System.out.println("befor each method it runs");
	}
	
	@Test
	@DisplayName("assert all of add mrthod")
	void testAllCases() {
		assertAll(
				()->assertEquals(4, mathUtils.add(2, 2)),
				()->assertEquals(6, mathUtils.add(4, 2)),
				()->assertEquals(1, mathUtils.add(0, 1))
				
				);
	}
	
	int cachedValue=0;
	@Test
	void test() {
	cachedValue=10;
		int expected=3;
		int actual=mathUtils.add(2,1);
		assertEquals(expected, actual,"this is testing add method");
	}
 
	
	@Test
	 void testMul() {
		 assertEquals(0, cachedValue);
		       assertEquals(4, mathUtils.mul(2, 2),"this mul method");
		 
	 }
	@Test
	
	void testArray() {
		int[] ar= {2,4,6,8};
		int[] result= {4,8,12,16};
		assertArrayEquals(result, mathUtils.arr(ar));
	}
	@AfterEach
	void clean() {
		System.out.println("after each method it runs");
	}
	@AfterAll
	static void finalall() {
		System.out.println("after end all method it runs");
	}
	
}
