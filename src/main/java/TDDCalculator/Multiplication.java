package TDDCalculator;

public class Multiplication extends AOperation{

        public Multiplication(AOperand num1, AOperand num2) {
            super(num1, num2);
            this.opSign = "*";
        }
        public int calculate() {
            //AOperand aOperand1 = new AOperand();
            //AOperand aOperand2 = new AOperand();
            int result;
            Multiplication aOperand1 = null;
            Multiplication aOperand2 = null;
            return result = aOperand1.calculate() + aOperand2.calculate();
        }



    }

