import java.time.LocalDate;

public class RunEvent {
    private String _Name;
    private String _Organizer;
    private DistanceEnum _EventType;
    private LocalDate _EventDate;
    private double _Distance;
    private double _Fee;
    private Location _Loc;
    private static final int _EventCounter=0;

    public RunEvent(String _Name, String _Organizer, DistanceEnum _EventType, LocalDate _EventDate, double _Distance,double _Fee, Location _Loc){
        this._Name=_Name;
        this._Organizer=_Organizer;
        this._EventType=_EventType;
        this._EventDate=_EventDate;
        this._Distance=_Distance;
        this._Fee=_Fee;
        this._Loc=_Loc;
    }


    public Location get_Loc() {
        return _Loc;
    }

    public void set_Loc(Location _Loc) {
        this._Loc = _Loc;
    }

    public double get_Distance() {
        return _Distance;
    }

    public void set_Distance(double _Distance) {
        this._Distance = _Distance;
    }

    public double get_Fee() {
        return _Fee;
    }

    public void set_Fee(double _Fee) {
        this._Fee = _Fee;
    }

    public LocalDate get_EventDate() {
        return _EventDate;
    }

    public void set_EventDate(LocalDate _EventDate) {
        this._EventDate = _EventDate;
    }

    public DistanceEnum get_EventType() {
        return _EventType;
    }

    public void set_EventType(DistanceEnum _EventType) {
        this._EventType = _EventType;
    }

    public String get_Organizer() {
        return _Organizer;
    }

    public void set_Organizer(String _Organizer) {
        this._Organizer = _Organizer;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public static int get_EventCounter() {
        return _EventCounter;
    }

    @Override
    public String toString() {
        return
                 _Name +
                " " + _Organizer +
                " " + _EventType +
                " " + _EventDate +
                " " + _Distance +
                " " + _Fee +
                " " + _Loc;
    }
}
