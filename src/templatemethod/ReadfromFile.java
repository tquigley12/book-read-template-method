package templatemethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadfromFile extends BookReader {

    private String filename;
    private File file;
    private Scanner inputFile;
    private String inputRecord;
        
    @Override
    void initialize() {
        try {
            // Modify this method to open the file prideprejudice.txt (included with project)
            //System.out.println("Open an input file");
            filename = "prideprejudice.txt";
            file = new File(filename);
            inputFile = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadfromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        //System.out.println("Loop writing out each record");
        while (inputFile.hasNextLine()) {
            inputRecord = inputFile.nextLine();
            System.out.println(inputRecord);
        }
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        //System.out.println("Close input file");
        inputFile.close();
    }
}
