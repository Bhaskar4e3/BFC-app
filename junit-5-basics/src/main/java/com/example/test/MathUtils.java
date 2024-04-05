package com.example.test;

public class MathUtils {
	
	public int add(int a, int b) {
		return a+b;
		
	}
	public int mul(int a,int b) {
		return a*b;
	}
	
	int[] ar= {2,4,6,8};
	
	public int[] arr(int[] ar) {
		int[] br=new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			br[i]=ar[i]*2;
		}
		return br;
	}

}
