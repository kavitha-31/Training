package training;
import java.util.Scanner;
public class Runrate {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
       System.out.println("enter total number of overs");
	   int overs=scanner.nextInt();
	   System.out.println("enter target runs:");
	   int runs=scanner.nextInt();
	   System.out.println("enter overs bowled");
	   int over=scanner.nextInt();
	   System.out.println("enter runs scored:");
	   int run=scanner.nextInt();
	   System.out.println("current run rate:");
	   float runrate=run/over;
	   System.out.println(runrate);
	   System.out.println("run rate required after 10 overs:");
	   float runratereq=(float)(runs-run)/(overs-over);
	   System.out.println(runratereq);
	   
	   
	}
}
