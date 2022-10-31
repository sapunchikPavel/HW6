package Task2;

public class Cloths {
    ClothPurity clothPurity;
    ClothTypes clothType;

    public Cloths(ClothTypes clothType, ClothPurity clothPurity) {
        this.clothPurity = clothPurity;
        this.clothType = clothType;
    }

    public enum ClothTypes {
        BUSINESS_SUIT,
        CASUAL_SUIT,
        SPORT_SUIT,
        NAKED
    }

    public enum ClothPurity {
        CLEAN,
        DIRTY,
        RAGGED
    }

}
