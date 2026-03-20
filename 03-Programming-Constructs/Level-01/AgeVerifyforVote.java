import java.util.Scanner;

class AgeVerifyforVote{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		if(Age>=18){
			System.out.println("The person's age is "+Age+" and can vote");
		}
		else{
			System.out.println("The person's age is "+Age+" and cannot vote");
		}
	}
}
