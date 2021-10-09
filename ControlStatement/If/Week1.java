import java.util.Scanner;
public class Week1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weekday number : ");
        int weekday = scanner.nextInt();
        if(weekday >7)
	    {
	     System.out.println(" Please enter Vaild number");
	
	    }
        if(weekday == 1) {

            System.out.println("Monday");

        } 
		if(weekday == 2) {

            System.out.println("Tuesday");

        } 
	    if(weekday == 3) {

            System.out.println("Wednesday");

        } 
		if(weekday == 4) {

            System.out.println("Thursday");

        } 
	     if(weekday == 5) {

            System.out.println("Friday");

        } 
		if(weekday == 6) {

            System.out.println("Saturday");

        } 
		if(weekday == 7) {

            System.out.println("Sunday");

        } 
    }
}
