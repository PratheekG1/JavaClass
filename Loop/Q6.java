import java.util.Scanner;
public class Q6{
public static void main(String[] agrs) {
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter String");
	String s = Scan.nextLine();
	String output = new String();
	int l=s.length();
	int i=0;
	while(i<l)
	{
		int j=0;
		while(j<i)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				break;
			}
		j++;
		}
		if(j==i)
		{
			output+=s.charAt(i);
		}
		i++;

	}
	System.out.println(output);	
}
}
