package TDDCalculator;

public class Addition extends AOperation{

    public Addition(AOperand num1, AOperand num2) {
        super(num1, num2);
        this.opSign = "+";
    }
    public int calculate() {
//AOperand aOperand1 = new AOperand();
//AOperand aOperand2 = new AOperand();
int result;
        Addition aOperand1 = null;
        Addition aOperand2 = null;
        return result = aOperand1.calculate() + aOperand2.calculate();

    }


}
