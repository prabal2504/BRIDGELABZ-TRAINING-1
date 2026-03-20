import java.util.Scanner;

class EmployeeBonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		if(year>5){
			double bonus = salary*0.05;
			System.out.println("Your bonus is : "+bonus);
		}
		else{
			System.out.println("No,Your service must be more than 5 year");
		}
	}
}
