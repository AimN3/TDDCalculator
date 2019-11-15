package TDDCalculator;

public class Main {
    public static void main(String[] args) {
        InData inData = new InData();
        OutData outData = new OutData();
        Calculator calc = new Calculator();
        calc.start(inData, outData);
    }
}
