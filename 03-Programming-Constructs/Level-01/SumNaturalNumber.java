import java.util.Scanner;

class SumNaturalNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		if(n>0){
			int sum1 = 0;
			int i = 1;
			while(i<=n){
				sum1 = sum1+i;
				i++;
			}
			
			int sum2 = n*(n+1)/2;
			if(sum1==sum2){
				System.out.println("Both results are correct!");
			}
			else{
				System.out.println("Results are not matching");
			}
			System.out.println("Sum using loop : "+sum1);
			System.out.println("Sum using formula : "+sum2);
		}
		else{
			System.out.println("Please enter the real number");
		}
	}
}
