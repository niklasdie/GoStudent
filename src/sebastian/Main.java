package sebastian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static final int MAXRUN = 10;
    private static LogBook logBook;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1........Läufe einlesen\n" +
                "2.........Location Info einfügen\n" +
                "3.........Läufe ausdrucken\n" +
                "4.........Gesamtstrecke berechnen\n" +
                "5.........Gesamtkosten berechnen\n" +
                "0.......ENDE");
        System.out.print("Ihre Wahl => ");
        String user = keyboard.nextLine();

        switch (Integer.parseInt(user)) {
            case 1 -> laeufeEinlesen();
            case 2 -> locationInfoEinfuegen();
            case 3 -> laeufeAusdrucken();
            case 4 -> gesamtstraeckeBerechnen();
            case 5 -> gesamtkostenBerechnen();
            case 0 -> System.exit(0);
        }
    }

    public static void laeufeEinlesen() {
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

    public static void locationInfoEinfuegen() {

        logBook.setLocation(new Location("Österreich", "Euro"));

    }

    public static void laeufeAusdrucken() {
        logBook.printRunEvents();
    }

    public static void gesamtstraeckeBerechnen() {

        System.out.println("Die Gesamtstrecke aller Läufe: " + logBook.computeTotalDistance());

    }

    public static void gesamtkostenBerechnen() {

        System.out.println("Die Gesamtkosten aller Läufe: " + logBook.computeTotalFees());

    }


}
