package training;
import java.util.Scanner;
public class Offer {
	   public static void main(String[] args) {
	       int p1,p2,p3,total,offer;
	       double temp;
	       Scanner sc = new Scanner(System.in);
	       p1 = sc.nextInt();
	       p2 = sc.nextInt();
	       p3 = sc.nextInt();
	       total = p1+p2+p3;
	       System.out.println("total "+total);
	       temp =0.2*total;
	       System.out.println("offer1 price "+temp);
	       if(p1<p2 && p1<p3)
	       {
	    	   offer=p1;
	    	   
	       }
	       else if(p2<p1 && p2<p3)
	       {
	    	   offer=p2;
	       }
	       else
	       {
	    	   offer=p3;
	       }
	       System.out.println("offer2 price "+offer);
	       System.out.println("payoffer offer1 price ");
	       System.out.println(total-temp);
	       System.out.println("payoffer offer2 price ");
	   System.out.println(total-offer);
	   
	   }

}
