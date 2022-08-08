package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Male";
        wolf.name = "Amur";
        wolf.weight = 45;
        wolf.age = 4;
        wolf.color = "gray";

        System.out.println("Пол волка" + wolf.gender);
        System.out.println("Кличка волка" + wolf.name);
        System.out.println("Вес волка" + wolf.weight);
        System.out.println("Возраст волка" + wolf.age);
        System.out.println("Окрас волка" + wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
