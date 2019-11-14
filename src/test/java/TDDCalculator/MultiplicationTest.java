package TDDCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName(" Multiplication should")
class MultiplicationTest {

    @Test
    @DisplayName("Correct multiplication")
    void MultiplicationShould() {
        AOperand aOperand1 = new AOperand(6);
        AOperand aOperand2 = new AOperand(2);
        Multiplication multiplication = new Multiplication(aOperand1, aOperand2);
        assertEquals(12, multiplication.calculate());
    }
}