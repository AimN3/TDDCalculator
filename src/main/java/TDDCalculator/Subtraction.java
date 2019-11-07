package TDDCalculator;

public class Subtraction extends AOperation {

    public Subtraction (AOperand aOperand1, AOperand aOperand2) {//(AOperand num1, AOperand num2) {
        super(aOperand1, aOperand2);  //super(num1, num2);
        this.opSign = "-";
    }

    public int calculate() {
        return aOperand1.calculate() - aOperand2.calculate();

    }


}