package TDDCalculator;

public class AOperand implements Calculable {
    int operand;   // класс хранит одно поле int operand и сюда будут скдажываться числа
    AOperand (int operand) {
     this.operand = operand;
    }


    public int calculate(){

        return operand;
    }


}
