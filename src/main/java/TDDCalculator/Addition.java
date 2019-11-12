package TDDCalculator;

public class Addition extends AOperation {

    public Addition (AOperand aOperand1, AOperand aOperand2) {
        super(aOperand1, aOperand2);  //super(num1, num2);

        this.opSign = "+";
    }

    public int calculate() {
return aOperand1.calculate() + aOperand2.calculate();

    }


}
