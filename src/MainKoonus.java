import java.util.Scanner;
import java.util.Random;

public class MainKoonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Küsi kasutajalt raadius (murdarv), kuni on päris murdarv
        double radius;
        while (true) {
            System.out.print("Sisesta koonuse raadius (murdarv): ");
            String input = scanner.nextLine().replace(",", "."); // koma -> punkt
            radius = Double.parseDouble(input);

            if (radius % 1 != 0) {
                break; // Kui pole täisarv, jätka
            }

            System.out.println("Palun sisesta päris murdarv, mitte täisarv (näiteks: 3.5, 7.01, 2.999)");
        }

        // 2. Genereeri juhuslik kõrgus 1.000 kuni 10.000, kolme komakohaga
        double height = Math.floor((1 + (9 * random.nextDouble())) * 1000) / 1000;

        // 3. Arvutused
        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
        double slantHeight = Math.sqrt(radius * radius + height * height);
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        // 4. Tulemuse väljastamine täislausega
        System.out.println("Kujundi koonus raadiusega " + radius +
                " ja kõrgusega " + height +
                " on ruumala " + volume +
                " ja pindala " + surfaceArea + ".");
    }
}
