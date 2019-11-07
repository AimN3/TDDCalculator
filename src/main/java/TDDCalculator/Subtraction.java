package TDDCalculator;

public class Subtraction extends AOperation {

    public Subtraction(AOperand num1, AOperand num2) {
        super(num1, num2);
        this.opSign = "-";
    }

    public int calculate() {
        AOperand aOperand1 = new AOperand();
        AOperand aOperand2 = new AOperand();// т.к нужно вызвать метод др класса создаем объект класса в котором он находится
        int result;
        return result = aOperand1.calculate() + aOperand2.calculate();
    }

}