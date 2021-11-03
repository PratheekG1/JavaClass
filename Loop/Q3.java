import java.util.Scanner;
public class Q3{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter String");
	String s = Scan.nextLine();
	String output = new String();
	int l=s.length();
	int i,j;
	for(i=0; i<l; i++)
	{
		for(j=0; j<i; j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				break;
			}
		}
		if(j==i)
		{
			output+=s.charAt(i);
		}
		
	}
	System.out.println(output);	
}
}
