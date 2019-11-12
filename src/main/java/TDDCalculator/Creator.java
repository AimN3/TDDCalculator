package TDDCalculator;

public class Creator {
    public static Calculable getOperation(String op, int iOperand1, int iOperand2) {            //на вход данные на выходе
    AOperand aOperand1 = new AOperand(iOperand1);
    AOperand aOperand2 = new AOperand(iOperand2);
        switch (op.trim()) {
            case "+":
                return (new Addition(aOperand1, aOperand2));
            //взять объект  // вернуть объект
            case "-":
                return (new Subtraction(aOperand1, aOperand2));
            case "*":
                return (new Multiplication(aOperand1, aOperand2));
            case "/":
                return (new Division(aOperand1, aOperand2));
            case "%":
                return (new ModuloDivision(aOperand1, aOperand2));
            default:
                return null;
        }

        }

}
