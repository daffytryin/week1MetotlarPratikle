import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber =0, lastNumber;

        while (temp!=0) {

            lastNumber=temp%10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println(number + " is a palindrom");
            return true;
        } else {
            System.out.println(number + " is not a palindrom.");
            return false;
        }

    }

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        x = input.nextInt();
        System.out.print(isPalindrom(x));


    }

}
