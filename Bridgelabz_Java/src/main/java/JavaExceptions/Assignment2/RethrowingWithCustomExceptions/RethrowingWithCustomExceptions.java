package JavaExceptions.Assignment2.RethrowingWithCustomExceptions;



class TransactionException extends Exception {
    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}

class TransactionService {
    public void processTransaction(String transactionId, double amount)
            throws TransactionException {

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException(
                    "Amount must be greater than zero"
                );
            }

            System.out.println("Transaction processed: " + transactionId);

        } catch (IllegalArgumentException e) {
            throw new TransactionException(
                "Transaction " + transactionId + " failed: "
                    + e.getMessage(),
                e
            );
        }
    }
}

public class RethrowingWithCustomExceptions {
    public static void main(String[] args) {
        TransactionService service = new TransactionService();

        try {
            service.processTransaction("TXN101", -500);

        } catch (TransactionException e) {
            System.out.println(e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}