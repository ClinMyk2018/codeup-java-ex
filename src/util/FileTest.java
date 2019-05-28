package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileTest {

    public static void main(String[] args) {
        String dataDirectory = "data";

        Path folder = Paths.get(dataDirectory);
        Path file = Paths.get(dataDirectory, "info.txt");

        if (Files.notExists(folder)) {
            try {
                Files.createDirectories(folder);
                System.out.println(folder + " directory was created!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(folder + " directory already exist!");
        }

        if (! Files.exists(file)) {
            try {
                Files.createFile(file);
                System.out.println(file + " file was created!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(file + " file already exist!");
        }

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get(String.valueOf(file));
        try {
            Files.write(filepath, groceryList);
            System.out.println("Your list was added.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n Beverage:\n" + " --------\n " + groceryList.get(0) + "\n\n" + " Add-in:\n" +
                " --------\n " + groceryList.get(1) + ", " + groceryList.get(2));
    }

}
