package TDDCalculator;
import java.util.Scanner;
import static java.lang.System.*;
public class InData {

    private Scanner sc;

    public InData() {

      Scanner sc = new Scanner(in);
      this.sc = sc;
    }

    public String nextLine() {

        String data = sc.nextLine();
        return (data);
    }
}