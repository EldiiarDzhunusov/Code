package Quiz;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Allergies {

    private final EnumSet<Allergen> allergens = EnumSet.noneOf(Allergen.class);
    public Allergies(int score) {
        for (Allergen allergen : Allergen.values()) {
            if ((score & (1 << allergen.ordinal())) != 0) {
                allergens.add(allergen);
            }
        }
    }
    //checking
    public boolean isAllergicTo(Allergen allergen) {
        return allergens.contains(allergen);
    }
    public List<Allergen> getList() {
        return new ArrayList<>(allergens);
    }
}