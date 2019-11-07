package TDDCalculator;

public class Addition extends AOperation{

    public Addition(AOperand num1, AOperand num2) {
        super(num1, num2);
        this.opSign = "+";
    }
    public int calculate() {

        int result = Integer.parseInt(num1 + opSign + num2);
        return result;
    }

    @Override
    public String getOpSign() {
        return null;
    }
}
