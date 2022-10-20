import java.util.Scanner;

public class MebelConstructor {
	public static void main(String[] args) {

		Mebel mebel = new Mebel();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите название");
		mebel.setName(scanner.nextLine());


		System.out.println("Введите цвет");
		mebel.color = scanner.nextLine();

		System.out.println("Введите тип");
		mebel.furnitur = scanner.nextLine();
		System.out.println(mebel);
	}
}
