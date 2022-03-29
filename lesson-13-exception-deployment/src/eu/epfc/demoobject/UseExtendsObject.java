package eu.epfc.demoobject;

public class UseExtendsObject {
    public static void main(String[] args) {
        ExtendsObject eo1 = new ExtendsObject();
        ExtendsObject eo2 = new ExtendsObject();
        System.out.println(eo1.hashCode() + " " + String.format("0x%08X", eo1.hashCode()));
        System.out.println(eo2.hashCode() + " " + String.format("0x%08X", eo2.hashCode()));
        System.out.println(eo1.equals(eo2));
        System.out.println(eo1.toString());
        System.out.println(eo2.toString());
    }
}
