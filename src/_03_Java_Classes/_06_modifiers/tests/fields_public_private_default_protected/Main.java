package _03_Java_Classes._06_modifiers.tests.fields_public_private_default_protected;

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
