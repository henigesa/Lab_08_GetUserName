import java.util.Scanner;

public class favoriteNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = safeInput.getInt(in, "Please enter your favorite integer");
        favDouble = safeInput.getDouble(in, "Please enter your favorite double");

        System.out.println("Your favorite integer is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);
    }
}