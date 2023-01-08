package filecsv.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {

        // If you don't have a file with product data, first run this code.

        // creating file (input)
        // use .txt (more easy)

        Scanner scan = new Scanner(System.in);

        String path;
        String[] fields;

        System.out.print("\nEnter the directory and file to be created: ");
        path = scan.nextLine();

        System.out.print("How many products: ");
        int rep = scan.nextInt();

        scan.nextLine();

        fields = new String[rep];

        for (int i = 0; i < rep; i++) {
            System.out.printf("Enter product %d data (name,price,quantity): ", i + 1);
            fields[i] = scan.nextLine();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String str : fields) {
                bw.write(str);
                bw.newLine();
            }
            File file = new File(path);
            System.out.println("\nFile exists? " + file.exists());

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        scan.close();

    }

}
