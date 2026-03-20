import java.util.Scanner;

class CheckNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		if(number>0){
			System.out.println("Positive");
		}
		else if(number<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
}
