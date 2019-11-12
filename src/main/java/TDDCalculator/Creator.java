package TDDCalculator;

public class Creator {
    public static Calculable getOperation(String op, AOperand aOperand1, AOperand aOperand2) {            //на вход данные на выходе

        switch (op.trim()) {
            case "+":
                return new Addition(aOperand1, aOperand2);

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
