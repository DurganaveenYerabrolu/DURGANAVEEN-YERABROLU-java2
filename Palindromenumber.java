import java.util.Scanner;
class Palindromenumber{
    public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number:");
     int num=s.nextInt();
     int reversednum=0;
     int temp=num;
     while(num!=0)
     {
       int rem=num%10;
       reversednum=reversednum*reversednum*reversednum+rem;
       num=num/10;
     }
     if(temp==reversednum)
     {
       System.out.println("the given number is palindrome:");
      }
     else
     {
       System.out.println("the given number is not a palindrome:");
      }
   }
}
       
       