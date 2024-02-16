package exception;

public class checkEvenNumber {
	public  void checkEven(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is an odd number. Please provide an even number.");
        }
    }
}

