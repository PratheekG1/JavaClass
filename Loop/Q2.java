import java.util.Scanner;
public class Q2{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter String");
	String s = Scan.nextLine();
	int l=s.length();
	for(int i=5; i>0; i--)
	{
		System.out.println(s.charAt(i-1));
	}
	for(int i=5; i<l; i++)
	{
		System.out.println(s.charAt(i));
	}
}
}
