public class Location {
    private String _County;
    private String _Currency;

    public Location(String _County, String _Currency){
        this._County = _County;
        this._Currency = _Currency;
    }

    public String get_County() {
        return _County;
    }

    public String get_Currency() {
        return _Currency;
    }

    public void set_County(String _County) {
        this._County = _County;
    }

    public void set_Currency(String _Currency) {
        this._Currency = _Currency;
    }

    @Override
    public String toString() {
        return
                "*" + _County +
                " -> " + _Currency +
                '*';
    }
}
