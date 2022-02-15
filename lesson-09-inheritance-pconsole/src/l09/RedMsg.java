package l09;

import java.io.IOException;

public class RedMsg {

    public static void main(String[] args) throws IOException {
        System.out.println("coucou to out");
        System.err.println("coucou to err");
        byte[] bytes = new byte[1000];
        System.in.read(bytes);
    }
}
