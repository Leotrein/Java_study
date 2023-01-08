package filecsv.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import filecsv.entities.Product;

public class Program {

    // Write a program to read the path of a file containing data on sold items.
    // Each item has a name, price and quantity, separated by a comma. You must
    // generate a new file called "summary.csv", located in a subfolder called "out"
    // from the original source file folder, containing only the name and total
    // value for that item.

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("\nEnter the existing file path: ");
        String path = scan.nextLine();

        File file = new File(path);
        String fileParent = file.getParent();

        new File(fileParent + "\\out").mkdir();
        String newFile = fileParent + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String read = br.readLine();

            while (read != null) {
                String[] fields = read.split(",");

                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                read = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                for (Product product : list) {
                    bw.write(product.getName() + ", " + String.format("%.2f", product.totalValue()));
                    bw.newLine();
                }
                File file2 = new File(newFile);
                System.out.println("\nFile exists? " + file2.exists());

            } catch (Exception e) {
                System.err.println("\nError to write new file: " + e.getMessage());
            }

        } catch (Exception e) {
            System.err.println("\nError to read file: " + e.getMessage());
        }
        scan.close();

    }

}
