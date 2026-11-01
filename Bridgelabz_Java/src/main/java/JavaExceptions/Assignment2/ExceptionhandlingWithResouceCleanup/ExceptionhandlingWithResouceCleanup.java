package JavaExceptions.Assignment2.ExceptionhandlingWithResouceCleanup;


class MyConnection {
    public void connect() {
        System.out.println("Connection opened");
    }

    public void process() {
        System.out.println("Processing data");
        throw new RuntimeException("Processing failed");
    }

    public void close() {
        System.out.println("Connection closed");
    }
}

public class ExceptionhandlingWithResouceCleanup {
    public static void main(String[] args) {
        MyConnection connection = new MyConnection();

        try {
            connection.connect();
            connection.process();

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            connection.close();
        }
    }
}