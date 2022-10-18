import java.util.Scanner;

public class Mebel {
    String name;
    String color;
    String furnitur;


    public Mebel() {
    }

    public Mebel(String name, String furnitur, String color) {
        this.name = name;
        this.furnitur = furnitur;
        this.color = color;
    }

    public void setName() {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setFurnitur() {
        this.furnitur = furnitur;
    }

    String getFurnitur() {
        return furnitur;
    }

    public void setColor() {
        this.color = color;
    }

    String getColor() {
        return color;
    }


    public String toString() {
        return "Название - " + name + "цвет - " + color + "Тип - " + furnitur;
    }

    public static void main(String[] args) {

        Mebel object = new Mebel();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название");
        object.name = scanner.nextLine();


        System.out.println("Введите цвет");
        object.color = scanner.nextLine();

        System.out.println("Введите тип");
        object.furnitur = scanner.nextLine();
        System.out.println(object);
    }

}




