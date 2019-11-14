package TDDCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    Parser parser = Parser.parse("5 + 4");

    @Test
    void parseTest() {
        //Parser.parse("5 + 4");
        //assertEquals("5 + 4", Parser.parse("5 + 4"));
    }

    @Test
    void getNum1Test() {

        assertEquals(5, parser.getNum1());

    }

    @Test
    void getNum2Test() {
        assertEquals(5
                , parser.getNum2());
    }

    @Test
    void getOpTest() {
        //assertEquals("+", parser.getOp());
    assertEquals("+", parser.getOp());
}

}