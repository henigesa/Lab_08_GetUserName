import java.util.Scanner;

public class getUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        firstName = safeInput.getNonZeroLength(in, "Please enter your first name ");
        lastName = safeInput.getNonZeroLength(in, "Please enter your last name ");

        System.out.println("Your name is " + firstName + " " + lastName + ".");
    }

}
