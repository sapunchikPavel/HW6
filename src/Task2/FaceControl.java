package Task2;

import Task2.Exceptions.*;

public class FaceControl {
    private final int MIN_AGE = 18;
    private final double MIN_CASH_AMOUNT = 100;

    private boolean isAdult, isWellDressed, isEnoughMoney = false;

    public void checkPerson(Person person) {

        try {
            if (person.getAge() >= MIN_AGE) {
                System.out.println("Посетитель совершеннолетний");
                isAdult = true;
            } else {
                throw new AgeException(person.getAge());
            }
        } catch (AgeException exception) {
            System.out.println(exception);
        }
        try {
            if (person.isDrunk()) {
                throw new IsDrunkException();
            } else {
                System.out.println("Посетитель не пьян");
            }
        } catch (IsDrunkException exception) {
            System.out.println(exception);
        }

        try {
            switch (person.getCloths().clothType) {
                case BUSINESS_SUIT:
                case CASUAL_SUIT: {
                    System.out.println("Стиль одежды проходит дресскод");
                    break;
                }
                case SPORT_SUIT:
                case NAKED: {
                    throw new ClothsTypeException();
                }
            }
            switch (person.getCloths().clothPurity) {
                case CLEAN: {
                    System.out.println("Опрятность одежды проходит дресскод");
                    break;
                }
                case DIRTY:
                case RAGGED: {
                    throw new ClothsPurityException();
                }
            }

            System.out.println("Посетитель одет подобающе");
            isWellDressed = true;

        } catch (ClothsTypeException | ClothsPurityException exception) {
            System.out.println(exception);
        }

        try {
            if (person.getCash() < MIN_CASH_AMOUNT) {
                throw new CashException();
            } else {
                System.out.println("У посетителя достаточно денег");
                isEnoughMoney = true;
            }
        } catch (CashException exception) {
            System.out.println(exception);
        } finally {
            if (!person.isDrunk() && isWellDressed && isAdult && !isEnoughMoney) {
                System.out.println("Ладно без денег тоже можем пропустить");
                System.out.println("Фейсконтроль пройден");
            } else if(!person.isDrunk() && isWellDressed && isAdult && isEnoughMoney){
                System.out.println("Фейсконтроль пройден");
            }else {
                System.out.println("Фейсконтроль не пройден");
            }
        }
    }
}
