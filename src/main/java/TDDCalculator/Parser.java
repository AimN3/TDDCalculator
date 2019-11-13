package TDDCalculator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.*;
public class Parser {

        public static String aStmt;
        private static int num1, num2;
        private static String op;

        public Parser (int num1, String op, int num2) {
            this.num1 = num1;
            this.num2 = num2;
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
                num1 = Integer.parseInt(n1);

                num2 = Integer.parseInt(n2);
            }
            return new Parser(num1, op, num2);
        }
        public int getNum1() {
            return this.num1;
        }
        public int getNum2() {
            return this.num2;
        }
        public String getOp() {
            return this.op;
        }
    }


