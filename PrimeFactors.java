/*	
** Sofia Guizar
** 08/10/15
** Project Euler. Problem 3. Largest prime factor of the number 600851475143 ""
** answer: 6857
*/

class PrimeFactors{
	public static void main(String[] args){
		long num = 600851475143L;
		long[] factor=new long[10];
		long temp=0;
		long max=0;
		int count=0;
		for(int i=1; i<num; i++){
			if(num%i==0){

				count=0;
				for(int j=1; j<=i ;j++){
					if(i%j==0){
						count++;
					}
				}
				if(count<=2){
					if(i>temp){
						max=i;
					}
					System.out.println(i);
					temp=i;
				}
			}	
		}
		
		System.out.println("Max : " + max);
	}
}
				