public class StackOverflowError
{
    public static void res(int n) {
        System.out.println("Number: " + n);
        if (n == 0)
            return;
        else
            res(++n);
        }

    public static void main(String[] args) {
        StackOverflowError.res(1);
    }
}