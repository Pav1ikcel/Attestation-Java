import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();
        toyShop.addToy(1, "Doll", 10, 30);
        toyShop.addToy(2, "Car", 15, 20);
        toyShop.addToy(3, "Teddy Bear", 8, 15);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Draw a toy");
            System.out.println("2. Update toy's weight");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Toy drawnToy = toyShop.drawToy();
                if (drawnToy != null) {
                    System.out.println("Congratulations! You won a " + drawnToy.getName());
                    toyShop.saveDrawnToyToFile(drawnToy);
                } else {
                    System.out.println("No more available toys to draw.");
                }
            } else if (choice == 2) {
                System.out.println("Enter toy ID to update weight: ");
                int id = scanner.nextInt();
                System.out.println("Enter new weight: ");
                double weight = scanner.nextDouble();
                toyShop.updateToyWeight(id, weight);
                System.out.println("Toy's weight updated.");
            } else if (choice == 3) {
                break;
            }
        }
    }
}
