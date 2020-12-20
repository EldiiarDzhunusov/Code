package PS08;

import java.util.HashSet;

public class BlackHoleBox extends Box{
    private HashSet<Thing> thingHashSet;
    @Override
    public void add(Thing thing) {
        thingHashSet.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
