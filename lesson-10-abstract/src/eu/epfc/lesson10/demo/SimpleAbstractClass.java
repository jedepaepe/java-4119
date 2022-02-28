package eu.epfc.lesson10.demo;

public abstract class SimpleAbstractClass {
    protected String field1;

    public int normalMethod1(int a, int b) {
        return 3 * a - b;
    }

    public void normalMethod2() {}

    abstract public String abstractMethod1(int x);
}
