package sebastian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static final int MAXRUN = 10;
    private static LogBook logBook;

    public static void main(String[] args) {
        laeufeEinlesen();
    }

    public static void laeufeEinlesen (){
        Scanner scanner;
        int count = 0;

        try {
            scanner = new Scanner(new File("src/sebastian/Events.txt"));
            while (scanner.hasNextLine()) {
                count++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        logBook = new LogBook(MAXRUN);
        logBook.importRunEvents("src/sebastian/Events.txt");
        System.out.println("Anzahl der eingelesenen Läufe: " + count);
    }

    public static void locationInfoEinfuegen (){

        logBook.setLocation(new Location("Österreich","Euro"));

    }

}
