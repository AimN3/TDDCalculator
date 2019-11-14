package TDDCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static TDDCalculator.Calculator.scan;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("enter an arithmetic statement")
    void CorrectArithmeticStatement() {
        new Scanner(scan.nextLine());

    }
}

