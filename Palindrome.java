import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, tested = "";
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Palindrome check word/ number");
        original = n.nextLine();
        original = original.replaceAll("\\w+","");
        for (int i=original.length()-1; i>=0; i--){
            tested = tested + original.charAt(i);
        }
        if (tested.equalsIgnoreCase(original)&&(original.length()!=1))
            System.out.println("Your input is palindrome");
        else
            System.out.println("your input is NOT palindrome");
    }

}
