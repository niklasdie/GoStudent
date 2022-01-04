package sebastian;

public class Test {
    public static void main(String[] args) {
        LogBook Test = new LogBook(10);

        Test.importRunEvents("src/sebastian/Events.txt");

        Test.printRunEvents();

    }
}
