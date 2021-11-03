import java.util.Scanner;
public class Q4{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter String");
	String s = Scan.nextLine();
	int l=s.length();
	int i=l;
	while(i>0)
	{
		System.out.println(s.charAt(i-1));
		i--;
	}
	
}
}
