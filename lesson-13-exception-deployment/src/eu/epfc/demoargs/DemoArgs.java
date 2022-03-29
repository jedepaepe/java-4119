package eu.epfc.demoargs;

public class DemoArgs {
    // exemple:
    // java -jar DemoArgs.jar Renée
    // Hello Renée
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("hello you");
        }
    }
}
