package training;
import java.util.Scanner;
public class luckycustomers
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int date = sc.nextInt();
int billno = sc.nextInt();
int temp=billno%10;
int temp1=billno%100;
if(date<=9 )
{
   if(date==temp && billno%date==0)
   {
       System.out.println("lucky customers");
   }
   else{
   System.out.println("unlucky customers");
   }
}
else if((date>9 || date<=31))
{
   if(date == temp1 && billno%date==0)
   {
       System.out.println("lucky customers");
   }
   else{
   System.out.println("unlucky customers");
   }
}

else{
   System.out.println("unlucky  customers");
}
}
}
