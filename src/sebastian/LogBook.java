package sebastian;

import java.time.LocalDate;
import java.util.Scanner;

public class LogBook {
    private RunEvent[] _Events;

    public LogBook(int size){
        this._Events =  new RunEvent[size];
    }

    public RunEvent[] get_Events() {
        return _Events;
    }

    public void set_Events(RunEvent[] _Events) {
        this._Events = _Events;
    }

    public boolean addRunEvent(RunEvent isFree){
        for (int i = 0; i < _Events.length; i++) {
            if (_Events[i] == null){
                _Events[i] = isFree;
                return true;
            }
        }
        return false;
    }
    public void importRunEvents(String fileName){
        Scanner Filereader = new Scanner(fileName);
        String line;
        String RunEventInformation [];


        while (Filereader.hasNextLine()){
            line = Filereader.nextLine();

            RunEventInformation = line.split(";");
            RunEvent newEvent = new RunEvent (
                    RunEventInformation[0],
                    RunEventInformation[4],
                    DistanceEnum.valueOf(RunEventInformation[1]),
                    LocalDate.parse(RunEventInformation[2]),
                    Double.parseDouble(RunEventInformation[3]),
                    Double.parseDouble(RunEventInformation[5]),
                    new Location("Österreich","Euro")
            );

            this.addRunEvent(newEvent);
        }

    }

}
