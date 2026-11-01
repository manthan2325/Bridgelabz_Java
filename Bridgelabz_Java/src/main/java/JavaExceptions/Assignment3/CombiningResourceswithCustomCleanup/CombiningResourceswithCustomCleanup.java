package JavaExceptions.Assignment3.CombiningResourceswithCustomCleanup;



import java.io.Closeable;
import java.io.IOException;
class DatabaseConnection implements Closeable {
public void open() {
System.out.println("Database connection opened.");
}
public void close() throws IOException {
System.out.println("Database connection closed.");
}
}
class Transaction implements Closeable {
public void start() {
System.out.println("Transaction started.");
}
public void close() throws IOException {
System.out.println("Transaction ended.");
}
}
public class CombiningResourceswithCustomCleanup {
public void manageDatabase() {
try (DatabaseConnection connection = new DatabaseConnection();
Transaction transaction = new Transaction()) {

connection.open();
transaction.start();
// Simulate an operation that might fail
throw new IOException("Simulated operation error");
} catch (IOException e) {
System.err.println("Exception during database operation: "

+ e.getMessage());

}
}
public static void main(String[] args) {
CombiningResourceswithCustomCleanup manager = new CombiningResourceswithCustomCleanup();
manager.manageDatabase();
}
}