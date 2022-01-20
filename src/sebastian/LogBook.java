package sebastian;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class LogBook {
    private RunEvent[] _Events;

    public LogBook(int size) {
        this._Events = new RunEvent[size];
    }

    public RunEvent[] get_Events() {
        return _Events;
    }

    public void set_Events(RunEvent[] _Events) {
        this._Events = _Events;
    }

    public boolean addRunEvent(RunEvent isFree) {
        for (int i = 0; i < _Events.length; i++) {
            if (_Events[i] == null) {
                _Events[i] = isFree;
                return true;
            }
        }
        return false;
    }

    public void importRunEvents(String fileName) {
        Scanner Filereader = null;
        try {
            Filereader = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        String[] RunEventInformation;


        while (Filereader.hasNextLine()) {
            line = Filereader.nextLine();

            RunEventInformation = line.split(";");
            RunEvent newEvent = new RunEvent(
                    RunEventInformation[0],
                    RunEventInformation[4],
                    DistanceEnum.valueOf(RunEventInformation[1]),
                    LocalDate.parse(RunEventInformation[2]),
                    Double.parseDouble(RunEventInformation[3]),
                    Double.parseDouble(RunEventInformation[5]),
                    new Location("Österreich", "Euro")
            );

            this.addRunEvent(newEvent);


        }

    }

    public void printRunEvents() {

        for (int i = 0; i < _Events.length; i++) {
            if (_Events[i] != null) {

                System.out.println(_Events[i].toString());

            }

        }

    }

    public void setLocation(Location location) {
        for (int i = 0; i < _Events.length; i++) {
            if (_Events[i] != null) {

                _Events[i].set_Loc(location);

            }
        }
    }

    public double computeTotalDistance() {
        double result = 0;

        for (int i = 0; i < _Events.length; i++) {
            if (_Events[i] != null) {

                result += _Events[i].get_Distance();

            }
        }
        return result;
    }

    public double computeTotalFees() {
        double result = 0;

        for (int i = 0; i < _Events.length; i++) {
            if (_Events[i] != null) {

                result += _Events[i].get_Fee();

            }
        }
        return result;
    }

}
