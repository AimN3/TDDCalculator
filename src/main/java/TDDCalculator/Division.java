package TDDCalculator;

public class Division extends AOperation{

        public Division(AOperand num1, AOperand num2) {
            super(num1, num2);
            this.opSign = "/";
        }
        public int calculate() {
        //AOperand aOperand1 = new AOperand();
        //AOperand aOperand2 = new AOperand();
        int result;
            Division aOperand1 = null;
            Division aOperand2 = null;
           return result = aOperand1.calculate() / aOperand2.calculate();

        }



    }

