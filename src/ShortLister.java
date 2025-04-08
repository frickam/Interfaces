import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class ShortLister {
    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<>();

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\stringData.txt");

        strings.add(new String("full"));
        strings.add(new String("Strange"));
        strings.add(new String("colorful"));
        strings.add(new String("small"));
        strings.add(new String("grey"));
        strings.add(new String("blue"));
        strings.add(new String("and"));
        strings.add(new String("cam"));

        for (String p: strings)
            System.out.println(p);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile())))
        {
            for(String rec : strings)
            {
                writer.write(rec, 0, rec.length());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnValue = chooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            displayShortWords(selectedFile);
        } else {
            System.out.println("No file selected. Terminating.");
            System.exit(0);
        }
    }

    private static void displayShortWords(File file) {
        ShortWordFilter filter = new ShortWordFilter();

        System.out.println("\nShort words (length < 5) from the selected file:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (filter.accept(line)) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getAbsolutePath());
        }


    }

}