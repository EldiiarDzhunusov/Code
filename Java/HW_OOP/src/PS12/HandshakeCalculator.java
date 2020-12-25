package PS12;//works but do not know where to put enum class
//either I should put it in this file
//or it is already implemented on the moodle

import java.util.ArrayList;
import java.util.Collections;

public class HandshakeCalculator {

    ArrayList<Signal> list = new ArrayList<>();

    public ArrayList<Signal> calculateHandshake(int num) {
        String binary = Integer.toBinaryString(num);
        int size = binary.length();
        for (int i = size-1; i >=0 ; i--) {
            if (binary.charAt(i)=='1'){
                if(size-(i)==5){
                    Collections.reverse(list);
                }
                else if(size-(i)==4){
                    list.add(Signal.JUMP);
                }
                else if(size-(i)==3){
                    list.add(Signal.CLOSE_YOUR_EYES);
                }
                else if(size-(i)==2){
                    list.add(Signal.DOUBLE_BLINK);
                }
                else if(size-(i)==1){
                    list.add(Signal.WINK);
                }
            }
        }


        return list;
    }

    enum Signal {
        WINK,
        DOUBLE_BLINK,
        JUMP,
        CLOSE_YOUR_EYES;
    }
}
