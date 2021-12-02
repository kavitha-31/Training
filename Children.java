package training;

import java.util.Scanner;

public class Children {
	public static void main(String[] args) {
		int choco;
		int child,count=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter no of chocolates");
		choco = sc.nextInt();
		System.out.println("enter no of childrens");
		child = sc.nextInt();
		for(int i=1;i<=child;i++)
		{
			if(choco>=i)
			{
				choco=choco-i;
				count++;
			}
		}
		System.out.println("chocolates remaining "+choco);
		System.out.println("no. of children got the chocolates "+count);
	}

}
