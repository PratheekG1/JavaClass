import java.util.Scanner;
public class Q1{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter String");
	String s = Scan.nextLine();
	System.out.println("After reverse");
	int l=s.length();
	for(int i=l; i>0; i--)
	{
		System.out.println(s.charAt(i-1));
	}
}
}
