package Task2.Exceptions;

public class ClothsPurityException extends Exception{
    @Override
    public String toString() {
        return "Костюм посетителя грязный, он не может пройти";
    }
}
