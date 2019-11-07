package TDDCalculator;

public class ModuloDivision extends AOperation {

        public ModuloDivision(AOperand num1, AOperand num2) {
            super(num1, num2);
            this.opSign = "%";
        }

        public int calculate() {
            AOperand aOperand1 = new AOperand();
            AOperand aOperand2 = new AOperand();
                    int result;
            return result = aOperand1.calculate() % aOperand2.calculate();

        }


    }

