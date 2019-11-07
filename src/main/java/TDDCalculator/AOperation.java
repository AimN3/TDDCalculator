package TDDCalculator;
import static java.lang.System.*;
public abstract class AOperation implements Calculable{
    public abstract int calculate();
AOperand aOperand1, aOperand2; //num1, num2;
String opSign = "";

AOperation (AOperand aOperand1, AOperand aOperand2) {                //  (AOperand num1, AOperand num2) {
    this.aOperand1 = aOperand1; //this.num1 = num1;
    this.aOperand2 = aOperand2; //this.num2 = num2;
}
public String getOpSigh() {
    System.out.println("Getting up sign");
    return this.opSign;
    }
public void setOpSigh(String opSigh) {
    if (opSigh == "+" || opSigh == "-" || opSigh == "/" || opSigh == "*" || opSigh == "%");
    this.opSign = opSigh;
}
@Override
   public String toString () {
    return aOperand1 + opSign + aOperand2 + "=" + calculate();
}

}
