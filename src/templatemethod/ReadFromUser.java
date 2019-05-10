package templatemethod;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader {

    private final ArrayList<String> userInput = new ArrayList<>();
    private String inputRecord;
        
    @Override
    void initialize() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter lines of text and hit enter after each line. ");
        System.out.println("The program will continue to prompt for more lines until you type 'exit'.");
        System.out.println("");
        System.out.println("Begin entering lines of text.");
        System.out.println("");
        do {
            inputRecord = keyboard.nextLine();
            if (!inputRecord.equals("exit")) {
                userInput.add(inputRecord);
            }
        } while (!inputRecord.equals("exit"));
        System.out.println("");
        System.out.println("");
    }

    @Override
    void startReading() {
        for (int i = 0; i < userInput.size(); i++) {
            System.out.println(userInput.get(i));
        }
    }

    @Override
    void stopReading() {
        
    }
}
