import java.util.Scanner;
public class Q2 {
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Age of first person");
	int First = Scan.nextInt();
	System.out.println("Age of Scecond person");
	int Second = Scan.nextInt();
	System.out.println("Age of Third person");
	int Third = Scan.nextInt();
	if((First>Second) && (First > Third))
	{
		System.out.println("First person is Older");
	
	}
	else if((Second>First) && (Second>Third))
	{
		System.out.println("Second person is Older");
	
	}
	else if((Third>First) && (Third>Second))
	{
		System.out.println("Third person is Older");
	
	}
}
}
