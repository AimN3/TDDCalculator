package TDDCalculator;
import com.google.errorprone.annotations.Var;

import static java.lang.System.*;
import java.util.Scanner;
public class Calculator {

        static Scanner scan;
        private String opSign;

        public String start() {
            String op = "";
            do {

                Scanner scan = new Scanner(in);

                String text3 = "Please type an arithmetic statement you wish to be calculated";
                out.print(text3);
                String aStmt = scan.nextLine();

                Parser parser = Parser.parse(aStmt);
                Calculable var = Creator.getOperation(parser.getOp(), parser.getNum1(), parser.getNum2());


                System.out.println(var.calculate());


               //if (var == null) throw new AssertionError();
               //String opSign = var.getOpSign();  // var это объект который возвращает get.Operation
            }
            while (!op.equals("q")) ;
            return ("Exit");

        }

    }



