package PS12;

import java.util.Random;
class DnDCharacter {
    int strength = ability();
    int dexterity = ability();
    int constitution = ability();
    int intelligence = ability();
    int wisdom = ability();
    int charisma = ability();

    int modifier(double n) {
        return (int) Math.floor((n - 10) / 2);
    }
    int ability() {
        Random rand = new Random();
        int min = 7, num1 = 0;
        for (int i = 0; i < 4; i++) {
            int temp = 1 + rand.nextInt(6);
            if (temp < min){
                min = temp;
            }
            num1 += temp;
        }
        return num1 - min;
    }
    int getStrength() {
        return strength;
    }
    int getDexterity() {
        return dexterity;
    }
    int getConstitution() {
        return constitution;
    }
    int getIntelligence() {
        return intelligence;
    }
    int getWisdom() {
        return wisdom;
    }
    int getCharisma() {
        return charisma;
    }
    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}