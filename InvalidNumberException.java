package LabExer5A;

public class InvalidNumberException extends Exception {
public InvalidNumberException() {
	super("out of range!!!");
	
}
public InvalidNumberException(String message) {
	
	super(message);

}
}
