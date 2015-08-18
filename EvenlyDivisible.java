/*	
** Sofia Guizar
** 08/3/15
** Project Euler. Problem 5. Smallest positive number that is 
** evenly divisible by all of the numbers from 1 to 20.
** answer: 232792560
**
** Stuck for quite some time with these problem, after doing some research I was able to solve it.
*/

import java.util.*;

class EvenlyDivisible{
	public static void main(String[] args){
		long num=1;
	
		for(long i=2; i<=20; i++){
			num*= i/findNum(num,i);
		}
		System.out.println("Smallest number: " + num);
	}
	
	//using recursive Euclidean algorithm to find greatest common divisor.
	public static long findNum(long a, long b){
		//System.out.println(a + ", " + b);
		if (b == 0) return a;
        else return findNum(b, a % b);
	}
}

				