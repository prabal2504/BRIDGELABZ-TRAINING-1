import java.util.Scanner;

class OddEven{
	public static void main(String srgs[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0){
			for(int i=1;i<=num;i++){
				if(i%2==0){
					System.out.println(i+" Even");
				}
				else{
					System.out.println(i+" Odd");
				}
			}
		}
		else{
			System.out.println("Please Enter valid number");
		}
	}
}
