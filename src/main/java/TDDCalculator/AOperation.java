package TDDCalculator;

public abstract class AOperation implements Calculable{
    public abstract int calculate();
AOperand aOperand1, aOperand2; //num1, num2;
String opSign = "";

AOperation (AOperand aOperand1, AOperand aOperand2) {                //  (AOperand num1, AOperand num2) {
    this.aOperand1 = aOperand1; //this.num1 = num1;
    this.aOperand2 = aOperand2; //this.num2 = num2;
}



}


