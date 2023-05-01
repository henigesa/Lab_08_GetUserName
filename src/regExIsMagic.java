import java.util.Scanner;

public class regExIsMagic
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String pattern = "^[OoSsVvQq]$";
        String input;

        input = safeInput.getRegExString(in, "Enter your M number", pattern);
        System.out.println(input);
    }
}