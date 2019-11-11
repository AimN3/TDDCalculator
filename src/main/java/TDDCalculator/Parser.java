package TDDCalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.*;
public class Parser {

        public static String aStmt;
        private static AOperand aOperand1, aOperand2; //int num1, num2;
        private static String op;

        public Parser(AOperand aOperand1, String op, AOperand aOperand2) { //(int num1, String op, int num2) {
            this.aOperand1 = aOperand1; //this.num1 = num1;
            this.aOperand2 = aOperand2; //this.num2 = num2;
            this.op = op;
        }// конструктор
        public static Parser parse(String aStmt) { // на вход принимае строку а на выходе
            Pattern pattern = Pattern.compile("(^\\d+)\\s*([-+*/%])\\s*(\\d+)");

            // Now create matcher object.
            Matcher m = pattern.matcher(aStmt);
            String n1;
            String n2;

            while (m.find()) {
                out.println("group1: " + m.group(0)); //полное совпадение
                n1 = m.group(1);
                op = m.group(2);
                n2 = m.group(3);
                out.println(n1);
                out.println(op);
                out.println(n2);


                //aOperand1 = Integer.parseInt(n1);
                //aOperand2 = Integer.parseInt(n2);
            }
            return new Parser(aOperand1, op, aOperand2);
        }
        public AOperand getAOperand1() {
            return this.aOperand1;
        }
        public AOperand getaOperand2() {
            return this.aOperand2;
        }
        public String getOp() {
            return this.op;
        }
    }


