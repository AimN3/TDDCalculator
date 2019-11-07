package TDDCalculator;
import static java.lang.System.*;
public abstract class AOperation implements Calculable{
    public abstract int calculate();
AOperand num1, num2;
String opSign = "";

AOperation (AOperand num1, AOperand num2) {
    this.num1 = num1;
    this.num2 = num2;
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
    return num1 + opSign + num2 + "=" + calculate();
}

}
