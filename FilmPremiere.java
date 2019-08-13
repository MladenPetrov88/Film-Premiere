import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String film = scan.nextLine();
        String type = scan.nextLine();
        int ticketsCount = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        switch (film) {
            case "John Wick":
                if ("Drink".equals(type)) {
                    price += 12 * ticketsCount;
                } else if ("Popcorn".equals(type)) {
                    price += 15 * ticketsCount;
                } else if ("Menu".equals(type)) {
                    price += 19 * ticketsCount;
                }
                break;
            case "Star Wars":
                if ("Drink".equals(type)) {
                    price += 18 * ticketsCount;
                } else if ("Popcorn".equals(type)) {
                    price += 25 * ticketsCount;
                } else if ("Menu".equals(type)) {
                    price += 30 * ticketsCount;
                }
                if (ticketsCount >= 4) {
                    price *= 0.7;
                }
                break;
            case "Jumanji":
                if ("Drink".equals(type)) {
                    price += 9 * ticketsCount;
                } else if ("Popcorn".equals(type)) {
                    price += 11 * ticketsCount;
                } else if ("Menu".equals(type)) {
                    price += 14 * ticketsCount;
                }
                if (ticketsCount == 2) {
                    price *= 0.85;
                }
                break;
        }
        System.out.println(String.format("Your bill is %.2f leva.", price));
    }
}
