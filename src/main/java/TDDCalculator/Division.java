package TDDCalculator;

public class Division extends AOperation{

        public Division(AOperand aOperand1, AOperand aOperand2) {
            super(aOperand1, aOperand2);
            this.opSign = "/";
        }
        public int calculate() {

           return  aOperand1.calculate() / aOperand2.calculate();

        }



    }

