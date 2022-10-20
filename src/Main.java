import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		SpaceCounter spaceCounter = new SpaceCounter();

        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();

		int result = spaceCounter.sum(phrase);

		System.out.println("Количество пробелов в предложении = " + (result - 1));
    }
}
