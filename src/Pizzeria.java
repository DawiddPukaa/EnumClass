import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza[] pizzas = Pizza.values();
        System.out.println("Dostępne pizze: ");

        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz nazwe pizzy UWAGA: Wążne jest zachowanie wielkości liter: ");

      // Pizza pizza = Pizza.valueOf(sc.nextLine());
      //  System.out.println("Dziekujemy za wybranie pizzy "+pizza.name());

        int nuberOfPizza = sc.nextInt();
        System.out.println(Pizza.ChoosePizza(nuberOfPizza));
    }


}
