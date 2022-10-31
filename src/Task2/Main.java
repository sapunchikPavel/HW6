package Task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(19,100,false, Cloths.ClothTypes.BUSINESS_SUIT, Cloths.ClothPurity.DIRTY);
        FaceControl faceControl = new FaceControl();
        faceControl.checkPerson(person);
    }
}
