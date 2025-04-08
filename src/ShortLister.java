import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


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





    }
    // ArrayList<interface> name = new ArrayList<>();     name.add(new Name())

    //  JFileChooser chooser = new JFileChooser();
    //        Scanner inFile;
    //        String line;
    //        Path target = new File(System.getProperty("user.dir")).toPath();
    //        target = target.resolve("src");
    //            // Set the chooser to the project src directory
    //        chooser.setCurrentDirectory(target.toFile());
    //
    //        try
    //        {
    //            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
    //            {
    //                    target = chooser.getSelectedFile().toPath();
    //                inFile = new Scanner(target);
    //                while (inFile.hasNextLine())
    //                {
    //                    line = inFile.nextLine();
    //                    System.out.println(line);
    //                }
    //
    //                inFile.close();
    //
    //            }
    //            else       // User did not pick a file, closed the chooser
    //            {
    //                System.out.println("Sorry, you must select a file! Terminating!");
    //                System.exit(0);
    //            }
    //        }
    //        catch (FileNotFoundException e)
    //        {
    //            System.out.println("File Not Found Error");
    //
    //        } catch (IOException e) {
    //            throw new RuntimeException(e);
    //        }




    // ArrayList<String> folks = new ArrayList<>();
    //        Scanner in = new Scanner(System.in);
    //        boolean done = false;
    //
    //        File workingDirectory = new File(System.getProperty("user.dir"));
    //        Path file = Paths.get(workingDirectory.getPath() + "\\src\\personData.txt");
    //
    //        String personRec = "";
    //        String ID = "";
    //        String firstName = "";
    //        String lastName = "";
    //        String title = "";
    //        int YOB = 0;
    //
    //        do {
    //            ID = SafeInput.getNonZeroLenString(in, "Enter the ID [6 digits]");
    //            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
    //            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
    //            title = SafeInput.getNonZeroLenString(in, "Enter your title");
    //            YOB = SafeInput.getRangedInt(in, "Enter your year of birth", 1000, 9999);
    //
    //            personRec = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    //            folks.add(personRec);
    //
    //            done = SafeInput.getYNConfirm(in, "Are you done?");
    //
    //        }while(!done);
    //
    //        for (String p: folks)
    //            System.out.println(p);
    //        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile())))
    //        {
    //
    //            // Finally can write the file LOL!
    //
    //            for(String rec : folks)
    //            {
    //                writer.write(rec, 0, rec.length());  // stupid syntax for write rec
    //                // 0 is where to start (1st char) the write
    //                // rec. length() is how many chars to write (all)
    //                writer.newLine();  // adds the new line
    //
    //            }
    //            writer.close(); // must close the file to seal it and flush buffer
    //            System.out.println("Data file written!");
    //        }
    //        catch (IOException e)
    //        {
    //            e.printStackTrace();
    //        }
}