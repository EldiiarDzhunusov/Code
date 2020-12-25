package PS12;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class HandshakeCalculatorTest {

    private HandshakeCalculator handshakeCalculator;

    @Before
    public void setUp() {
        handshakeCalculator = new HandshakeCalculator();
    }

    @Test
    public void testThatInput1YieldsAWink() {
        assertEquals(
                singletonList(HandshakeCalculator.Signal.WINK),
                handshakeCalculator.calculateHandshake(1));
    }


    @Test
    public void testThatInput2YieldsADoubleBlink() {
        assertEquals(
                singletonList(HandshakeCalculator.Signal.DOUBLE_BLINK),
                handshakeCalculator.calculateHandshake(2));
    }


    @Test
    public void testThatInput4YieldsACloseYourEyes() {
        assertEquals(
                singletonList(HandshakeCalculator.Signal.CLOSE_YOUR_EYES),
                handshakeCalculator.calculateHandshake(4));
    }


    @Test
    public void testThatInput8YieldsAJump() {
        assertEquals(
                singletonList(HandshakeCalculator.Signal.JUMP),
                handshakeCalculator.calculateHandshake(8));
    }


    @Test
    public void testAnInputThatYieldsTwoActions() {
        assertEquals(
                asList(HandshakeCalculator.Signal.WINK, HandshakeCalculator.Signal.DOUBLE_BLINK),
                handshakeCalculator.calculateHandshake(3));
    }


    @Test
    public void testAnInputThatYieldsTwoReversedActions() {
        assertEquals(
                asList(HandshakeCalculator.Signal.DOUBLE_BLINK, HandshakeCalculator.Signal.WINK),
                handshakeCalculator.calculateHandshake(19));
    }


    @Test
    public void testReversingASingleActionYieldsTheSameAction() {
        assertEquals(
                singletonList(HandshakeCalculator.Signal.JUMP),
                handshakeCalculator.calculateHandshake(24));
    }

    @Test
    public void testReversingNoActionsYieldsNoActions() {
        assertEquals(
                emptyList(),
                handshakeCalculator.calculateHandshake(16));
    }


    @Test
    public void testInputThatYieldsAllActions() {
        assertEquals(
                asList(HandshakeCalculator.Signal.WINK, HandshakeCalculator.Signal.DOUBLE_BLINK, HandshakeCalculator.Signal.CLOSE_YOUR_EYES, HandshakeCalculator.Signal.JUMP),
                handshakeCalculator.calculateHandshake(15));
    }


    @Test
    public void testInputThatYieldsAllActionsReversed() {
        assertEquals(
                asList(HandshakeCalculator.Signal.JUMP, HandshakeCalculator.Signal.CLOSE_YOUR_EYES, HandshakeCalculator.Signal.DOUBLE_BLINK, HandshakeCalculator.Signal.WINK),
                handshakeCalculator.calculateHandshake(31));
    }


    @Test
    public void testThatInput0YieldsNoActions() {
        assertEquals(
                emptyList(),
                handshakeCalculator.calculateHandshake(0));
    }

}