package TDDCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatorTest {
    Calculable calculableAdd = Creator.getOperation("+", 5, 6);
    Calculable calculableSub = Creator.getOperation("-", 14, 4);
    Calculable calculableMul = Creator.getOperation("*", 3, 5);
    Calculable calculableDiv = Creator.getOperation("/", 45, 5);
    Calculable calculableMod = Creator.getOperation("%", 13, 2);

    @Test
    void getOperationTest() {
        assertEquals(11, calculableAdd.calculate());
        assertEquals(10, calculableSub.calculate());
        assertEquals(15, calculableMul.calculate());
        assertEquals(9, calculableDiv.calculate());
        assertEquals(1, calculableMod.calculate());
    }
}