package _03_Java_Classes.tests._06_modifiers.fields_public_private_default_protected;

public class Main {
    public static void main(String[] args) {
        FoodFields orange = new FoodFields(
                "orange",
                "yellow",
                "Morocco",
                true,
                1500,
                4);

        System.out.println(orange.salePricePerKilogram);
    }
}
