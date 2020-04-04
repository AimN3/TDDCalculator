package TDDCalculator;

import java.util.Scanner;

public class Calculator {

        //static Scanner scan;
        //private String opSign;

        public String start(InData inData, OutData outData) {
            String op = "";
            do {

                //String in = "";
                //Scanner scan = new Scanner(in);
               String text3 = "Please type an arithmetic statement you wish to be calculated";

                OutData.print(text3);

                String aStmt = inData.nextLine();

                Parser parser = Parser.parse(aStmt);
                Calculable var = Creator.getOperation(parser.getOp(), parser.getNum1(), parser.getNum2());
                OutData.print(var.calculate());
               //if (var == null) throw new AssertionError();
               //String opSign = var.getOpSign();  // var это объект который возвращает get.Operation
            }
            while (!op.equals("q")) ;
            OutData.print("Exit");
            return ("Exit");

        }

    }



