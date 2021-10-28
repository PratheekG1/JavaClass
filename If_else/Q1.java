import java.util.Scanner;
public class Q1 {
public static void  main(String[] agrs) {
	Scanner Scan =new Scanner(System.in );
	System.out.println("Enter the value of length");
	int length=Scan.nextInt();
	System.out.println("Enter the value of Breadth");
	int Breadth=Scan.nextInt();
	double area = length*Breadth;
	double perimeter= 2*(length+Breadth);
	if(area>perimeter)
	{
		System.out.println("Area is greater then perimeter");
	
	}
	else 
	{
		System.out.println("Perimetr is greater then area");
	}
	
	
}

}
