import java.util.Scanner;
public class Q4{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	
	System.out.println("Enter an Alphabet");
	char ch =Scan.next().charAt(0);
	if(ch=='a' || ch=='A' ||ch=='e'|| ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
	{
		System.out.println("It is Vowels");
	}
	else
	{
		System.out.println("It is Consonant");
	}
	}
}
