import java.util.Scanner;
public class Q3{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Age of the person");
	int age = Scan.nextInt();
	if(age<18)
	{
		System.out.println("MNinor who are not Eligible to Work");
	}
	else if(age>=18 && age<=60)
	{
		System.out.println("Eligible to Work");
	}
	else
	{
		System.out.println("Too Old to work as per govt regulation");
	}
}
}

