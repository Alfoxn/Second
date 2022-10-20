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

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setFurnitur(String furnitur) {
        this.furnitur = furnitur;
    }

    String getFurnitur() {
        return furnitur;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }


    public String toString() {
        return "Название - " + name + "цвет - " + color + "Тип - " + furnitur;
    }

}




