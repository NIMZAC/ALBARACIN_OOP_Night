package albaracin_nimrold;

import java.util.Scanner;

public class Albaracin_Nimrold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message:");
        String words = scanner.nextLine();
        boolean foundMisplacedCapital = false;
        for (int i = 1; i < words.length(); i++) {
            if (Character.isUpperCase(words.charAt(i)) && 
                Character.isLetter(words.charAt(i - 1)) && 
                Character.isLowerCase(words.charAt(i - 1))) {
                foundMisplacedCapital = true;
                break;
            }
        }
        System.out.println(foundMisplacedCapital ? "JEJE!" : "uWu");
        scanner.close();
    }
}
