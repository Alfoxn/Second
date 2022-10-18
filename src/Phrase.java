import java.util.Scanner;

public class Phrase {
    String d;
    int f;

    Phrase() {
    }

    Scanner scanner = new Scanner(System.in);

    void phrase() {
        d = scanner.nextLine();
    }

    void sum() {

        String[] ph = d.split(" ");

        for (int i = 0; i < ph.length; i++) {

            if (ph[i] == " ") {

            } else {
                f++;
            }
        }
        System.out.println("Количество пробелов в предложении = " + (f - 1));
    }
}



