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

}
