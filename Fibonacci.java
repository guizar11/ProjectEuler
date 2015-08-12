/*	
** Sofia Guizar
** 08/10/15
** Project Euler. Problem 2. "Even Fibonacci Numbers NON RECURSIVE"
** answer: 4613732
*/
class Fibonacci{
	public static void main(String[] args){
		int no = 0;
		int sum=0;
		int[] num=new int[34];
		int j=0;
		int k=0;
		int count=0;
		for(int i=1; i<4000000; i++){
			j=k;
			if(i==1){
				j = i+1;
				num[count]=i;
				num[count+1]=j;
				count=2;
			}	
			k = i+j;
			num[count]=k;
			
			i=j-1;
			count++;
		}
	    sum=evenNum(num);
		System.out.println("Total sum: " + sum);
	}
	
	static int evenNum(int[] num){
		int sum=0;
		for(int i=0; i<num.length; i++){
			if(num[i]%2==0){
				sum+=num[i];
				System.out.print(num[i] + " ,");
			}
		}
		return sum;
	}
}