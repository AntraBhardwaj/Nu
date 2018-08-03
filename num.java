package number;
import java.util.*;
public class Checkchar 
{
    public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a,b,c;;
		Scanner s= new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		if(a>b&&a>c)
		{
			System.out.println("a is largest");
		
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
    }

}