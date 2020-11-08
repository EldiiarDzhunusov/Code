
import HW.Customer;

import java.util.Arrays;

public class Draft {
    public static void main(String[] args) {
        Ball ball = new Ball(12,3,5,6,87);
        System.out.println(ball.toString());
        System.out.println(ball.getXDelta());
        ball.setXDelta(45);
        System.out.println(ball.toString());
    }

}
