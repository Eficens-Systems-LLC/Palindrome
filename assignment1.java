import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        while (1 == 1) {
            String s = "";
            System.out.println("Enter a string");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            s=s.toLowerCase();
            String rev="";
           for(int i=s.length()-1;i>=0;i--)
           {
                rev= rev +s.charAt(i);

            }
           System.out.println(rev);
           if(s.equals(rev))
           {
               System.out.println("It is a palindrome");
           }
            else
            {
                System.out.println("It is not a palindrome");
            }


        }

    }
}
