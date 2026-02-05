
import java.io.*;
import java.util.*;

public class BookstoreApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        double total = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("books.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Book book = new Book(
                        parts[0],
                        parts[1],
                        parts[2],
                        Integer.parseInt(parts[3]),
                        Double.parseDouble(parts[4])
                );
                books.add(book);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        System.out.println("Books for sale:");
        for (Book b : books) {
            System.out.println(b);
            total += b.getPrice();
        }

        System.out.println("Total value of inventory: $" + total);
    }
}
