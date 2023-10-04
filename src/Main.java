import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = {'0','1','2','3','4','5','6','7','8','9'};
        int count = 0;
        boolean var = true;
        String str;
        System.out.println("enter a six-digit number");
        do
        {
            str = scanner.nextLine();
            for (int i = 0; i < str.length(); i++) for (int j = 0; j < 10; j++) if (str.charAt(i) != arr[j]) count++;
            if (count == str.length() * 9) var = false;
            else
            {
                count = 0;
                System.out.println("you are wrong, repeate please");
            }
        }while(var);
        double DoubleNumber = MyStringToInteger.myStringToInteger(str);
        for (int i = 0; i < 6; i++) DoubleNumber = DoubleNumber / 10.0;
        if(DoubleNumber >= 0.1 && DoubleNumber < 1.0) System.out.println("This number is six-digit");
        else System.out.println("This number is not six-digit");
    }
}
