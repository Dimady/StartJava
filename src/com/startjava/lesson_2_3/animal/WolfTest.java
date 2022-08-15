package src.com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Мужской");
        wolf.setName("Амур");
        wolf.setWeight(45);
        wolf.setAge(4);
        wolf.setColor("серый");

        System.out.println("Пол волка: " + wolf.getGender());
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Окрас волка: " + wolf.getColor() + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
