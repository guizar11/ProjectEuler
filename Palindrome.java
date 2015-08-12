/*	
** Sofia Guizar
** 08/12/15
** Project Euler. Problem 4. "Largest Palindrome from 3-digit products"
** answer: 906609
*/

import java.util.*;

class Palindrome{
	public static void main(String[] args){
		int num = 999;
		long product= 0;
		String stringNo;
		StringBuilder test;
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		
		for(int i=100; i<=num; i++){
			for(int a=100; a<=num ; a++){ 
				product = i*a;
				stringNo = String.valueOf(product);
				test = new StringBuilder(stringNo);
			
				test.reverse();
				
				if(stringNo.equals(test.toString())){
					palindromes.add(Integer.parseInt(stringNo));
					
				}
			}
		} 
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + Collections.max(palindromes));
	}
}
				