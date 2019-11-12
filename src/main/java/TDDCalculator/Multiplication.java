package TDDCalculator;

public class Multiplication extends AOperation{

        public Multiplication(AOperand aOperand1, AOperand aOperand2) {
            super(aOperand1, aOperand2);
            this.opSign = "*";
        }
        public int calculate() {

            return aOperand1.calculate() + aOperand2.calculate();
        }



    }

