package Task2.Exceptions;

public class AgeException extends Exception {
    private int age;

    public AgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Посетителю " + this.age + " лет, он слишком молод";
    }
}
