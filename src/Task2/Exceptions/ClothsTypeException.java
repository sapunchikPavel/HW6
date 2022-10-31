package Task2.Exceptions;

public class ClothsTypeException extends Exception{
    @Override
    public String toString() {
        return "Посетитель одет неподобающе";
    }
}
