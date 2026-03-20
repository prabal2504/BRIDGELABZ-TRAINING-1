import java.util.Scanner;

class FactorialFor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n>0){
			int fact = 1;
			for(int i=1;i<=n;i++){
				fact=fact*i;
			}
		System.out.println("Factorial of "+n+"is : "+fact);
		}
		else{
			System.out.println("Please enter a positive number");
		}
	}
}
