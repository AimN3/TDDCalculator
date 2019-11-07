package TDDCalculator;

public class Creator {
    public static Calculable getOperation(String op, AOperand num1, AOperand num2) {            //на вход данные на выходе

        switch (op.trim()) {
            case "+":
                return new Addition(num1, num2);

            //взять объект  // вернуть объект
            case "-":
                return (new Subtraction(num1, num1));
            case "*":
                return (new Multiplication(num1, num2));
            case "/":
                return (new Division(num1, num2));
            case "%":
                return (new ModuloDivision(num1, num2));
            default:
                return null;
        }

        }

}
