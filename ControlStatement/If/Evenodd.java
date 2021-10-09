import java.util.Scanner;

class Evenodd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter a number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 )
        System.out.println("Even Number");
     else
        System.out.println(" Odd Number");
  }
}