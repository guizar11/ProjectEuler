/*	
** Sofia Guizar
** 08/10/15
** Project Euler. Problem 1. "Multiples of 3 and 5"
** answer: 233168
*/
class Multiples{
	public static void main(String[] args){
		int sum=0;
		for(int i=0; i<1000; i++){
			
			if(i%3==0){
				sum += i;
			}else if(i%5==0){
				sum += i;
			}
			
		}
		System.out.println("Total sum: " + sum);
	}
}