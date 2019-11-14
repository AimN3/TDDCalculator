package TDDCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Subtraction should")
class SubtractionTest {
    @Test
    @DisplayName("Correct subtraction")

    public void subtractionShould() {
        AOperand aOperand1 = new AOperand(6);
        AOperand aOperand2 = new AOperand(2);
        Subtraction subtraction = new Subtraction(aOperand1, aOperand2);
        assertEquals(4, subtraction.calculate());
        //assertEquals(4, (aOperand1.calculate(6) - aOperand2.calculate(2);

    }
}