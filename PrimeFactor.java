package com.primefactor;

public class PrimeFactor {

	public static void main(String[] args) {
	     long num=600851475143l;
	     for(int i=2;i<num;i++) {
	    	 while(num%i==0) {
	    		 num=num/i;
	    	 }
	     }
        if(num>2) {
        	System.out.println(num);
        	
        }
	}

}
