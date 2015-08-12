/*	
** Sofia Guizar
** 08/10/15
** Project Euler. Problem 2. "Even Fibonacci Numbers RECURSIVE"
** answer: 4613732
*/
class FibonacciR{
	public static void main(String[] args){
		long num=0;
		long sum=0;
		
		for(int i = 0; i<4000000; i++){
			num=fib(i);
			if(num%2==0){
				sum+=num;
				//System.out.print(num + " ,");
			}
		}
		System.out.println("Even numbers sum: " + sum);
	}
	static long fib(long num){
		if(num<=1){
			return num;
		}else{
			return fib(num-1) + fib(num - 2);
		}
	}
}