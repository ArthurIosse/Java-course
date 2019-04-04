public class Main {

    public static boolean isPalindrome(int number)
    {
        for ( number = number ; number > 0 ; number/=10)
            System.out.println("number = " + number);

        return true;
    }

    public static void main (String[] argc)
    {

    boolean a = isPalindrome(3425);

    }
}
