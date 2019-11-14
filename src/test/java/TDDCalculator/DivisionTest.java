package TDDCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Division should")
class DivisionTest {

    @Test
    @DisplayName("Correct division")
    public void divisionShould() {
            AOperand aOperand1 = new AOperand(6);
            AOperand aOperand2 = new AOperand(2);
            Division division= new Division(aOperand1, aOperand2);
            assertEquals(3, division.calculate());
    }
}