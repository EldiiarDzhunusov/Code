package PS08;

import java.util.*;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private static int totalWeight = 0;
    private static HashSet<Thing> thingHashSet;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight()+totalWeight<=maxWeight){
            totalWeight+=thing.getWeight();
            thingHashSet.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return thingHashSet.contains(thing);
    }
}
