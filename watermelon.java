package training;
import java.util.*;
public class watermelon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the watermelon weight:");
		int watermelon=sc.nextInt();
			if(watermelon%2==0)
			{
				System.out.println();
			}
			else
			{
				System.out.println("not possible");
			}
		for(int i=0;i<watermelon;i++)
		{
			System.out.println("possible ways are: ");
			System.out.println(watermelon-i);
		}
	}

}
