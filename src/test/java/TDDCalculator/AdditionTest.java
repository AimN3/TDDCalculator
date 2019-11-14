package TDDCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Addition Should")
class AdditionTest {

    @Test
    @DisplayName("Correct Addition")
    void additionShould() {
        AOperand aOperand1 = new AOperand(6);
        AOperand aOperand2 = new AOperand(2);
        Addition addition = new Addition(aOperand1, aOperand2);
        assertEquals(8, addition.calculate());
    }
}