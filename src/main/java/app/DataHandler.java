package app;

public class DataHandler {

    private final Object lock = new Object(); // Объект для синхронизации

    public synchronized int modify(int num) {
        synchronized (lock) { // Блокировка объекта lock
            try {
                num = num * 3;
                return num;
            } finally {
                // Разблокировка объекта lock
            }
        }
    }
}