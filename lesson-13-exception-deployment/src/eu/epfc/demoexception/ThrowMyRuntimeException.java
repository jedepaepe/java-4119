package eu.epfc.demoexception;

import java.util.Scanner;

public class ThrowMyRuntimeException {

    public static void main(String[] args) throws MyException {
        Scanner keyboard = new Scanner(System.in);
        do {
            String cmd = keyboard.nextLine();
            if (cmd.equals("OK")) {
                throw new MyRuntimeException("Je ne prends que OK");
            } else if (cmd.equals("1")) {
                throw new MyException("Tu ne pouvais pas taper 1");
            }
        } while (true);
    }
}
