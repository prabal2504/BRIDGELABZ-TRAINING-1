import java.util.Scanner;

class LargestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Number1 = sc.nextInt();
		int Number2 = sc.nextInt();
		int Number3 = sc.nextInt();
		if(Number1>Number2&&Number1>Number3){
			System.out.println("Number1 is largest");
		}
		else if(Number2>Number1&&Number2>Number3){
			System.out.println("Number2 is Largest");
		}
		else{
			System.out.println("Number3 is largest");
		}
	}
}
