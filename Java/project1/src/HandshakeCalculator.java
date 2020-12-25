//not working

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
enum Signal{
    WINK,
    DOUBLE_BLINK,
    JUMP,
    CLOSE_YOUR_EYES;
}
public class HandshakeCalculator {

    ArrayList<Signal> list = new ArrayList<>();

    public ArrayList<Signal> calculateHandshake(int num) {
        String binary = Integer.toBinaryString(num);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i)=='1'){
                if(binary.length()-(i)==5){
                    Collections.reverse(list);
                }
                else if(binary.length()-(i)==4){
                    list.add(Signal.JUMP);
                }
                else if(binary.length()-(i)==3){
                    list.add(Signal.CLOSE_YOUR_EYES);
                }
                else if(binary.length()-(i)==2){
                    list.add(Signal.DOUBLE_BLINK);
                }
                else if(binary.length()-(i)==1){
                    list.add(Signal.WINK);
                }
            }
        }
        return list;
    }

}
