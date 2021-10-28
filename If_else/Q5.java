import java.util.Scanner;
public class Q5{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter Salary");
	double salary = Scan.nextInt();
	System.out.println("Year of Service done");
	int year = Scan.nextInt();
	if(year>=5)
	{
		double NewSalary = salary*1.05;
		System.out.println("Year of Service done" +NewSalary);
	}
	else
	{
		System.out.println("Year of Service done" +salary);
	}
}
}
