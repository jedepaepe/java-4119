package eu.epfc.lesson10.demo;

public class SimpleChildClass extends SimpleAbstractClass {
    public static void main(String[] args) {
        SimpleChildClass c = new SimpleChildClass();
        System.out.println(c);
    }

    @Override
    public String abstractMethod1(int x) {
        return "salut l'Abstraction " + x;
    }
}
