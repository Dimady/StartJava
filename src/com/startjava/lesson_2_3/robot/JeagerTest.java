package src.com.startjava.lesson_2_3.robot;

public class JeagerTest {
    public static void main(String[] args) {
        Jeager jeager1 = new Jeager();

        jeager1.setModelName("Bracer Phoenix");
        jeager1.setMark("Mark-5");
        jeager1.setOrigin ("USA");
        jeager1.setHeight(70.7f);
        jeager1.setWeight(2.1f);
        jeager1.setStrength(8);
        jeager1.setArmor(9);

        System.out.println("\nИмя робота: " + jeager1.getModelName());
        System.out.println("Марка робота: " + jeager1.getMark());
        System.out.println("Производитель робота: " + jeager1.getOrigin());
        System.out.println("Рост робота: " + jeager1.getHeight());
        System.out.println("Вес робота: " + jeager1.getWeight());
        System.out.println("Сила робота: " + jeager1.getStrength());
        System.out.println("Броня робота: " + jeager1.getArmor() + "\n");

        System.out.println(jeager1.drift());
        jeager1.move();
        System.out.println(jeager1.scanKaiju());
        jeager1.useVortexCanon();

        Jeager jeager2 = new Jeager("Gipsy Danger", "Mark-3", "USA",
                79.25f, 1.98f, 8, 6);

        System.out.println("\nИмя робота: " + jeager2.getModelName());
        System.out.println("Марка робота: " + jeager2.getMark());
        System.out.println("Производитель робота: " + jeager2.getOrigin());
        System.out.println("Рост робота: " + jeager2.getHeight());
        System.out.println("Вес робота: " + jeager2.getWeight());
        System.out.println("Сила робота: " + jeager2.getStrength());
        System.out.println("Броня робота: " + jeager2.getArmor() + "\n");

        System.out.println(jeager2.drift());
        jeager2.move();
        System.out.println(jeager2.scanKaiju());
        jeager2.useVortexCanon();
    }
}
