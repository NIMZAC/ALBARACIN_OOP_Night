
package albaracin.night;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();

        System.out.print("Enter code: ");
        int code = scanner.nextInt();

        if (editorType == 1 && code == 1) {
            System.out.println("SUCCESS");
        } else if (editorType == 2 && code == 1) {
            System.out.println("SUCCESS");
        } else if (editorType == 1 && code == 2) {
            System.out.println(initialText + "\nNew Text\nSUCCESS");
        } else {
            System.out.println("Invalid input combination");
        }
    }
}
