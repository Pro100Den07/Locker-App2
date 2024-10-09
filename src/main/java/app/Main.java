package app;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new app.DataRepository().getData();
        app.DataHandler dataHandler = new app.DataHandler();
        for (int num : numbers) {
            System.out.println("Initial value is " + num);
            int newNum = dataHandler.modify(num);
            System.out.println("New value is " + newNum);
        }
    }
}