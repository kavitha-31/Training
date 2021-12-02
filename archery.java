package training;
import java.util.*;
public class archery {
	public static void main(String[] args) {
		int target=100;
		int turn;
		int points=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			System.out.println("Enter the turn "+i);
			 turn=sc.nextInt();
			points+=turn;
			if(points>=target) {
				System.out.println("No of turns :"+i);
				break;
			}
			
		}
	}

}
