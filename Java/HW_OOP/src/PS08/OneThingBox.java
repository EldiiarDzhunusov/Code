package PS08;

import java.util.HashSet;

public class OneThingBox extends Box{

    public static int number =0;
    public static HashSet<Thing> thingHashSet;


    @Override
    public void add(Thing thing) {
        if(number ==0){
            thingHashSet.add(thing);
            number=1;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return thingHashSet.contains(thing);
    }
}
