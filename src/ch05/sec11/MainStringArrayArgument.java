package ch05.sec11;

import java.util.Arrays;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++){
            System.out.printf("args[%d] : %s\n", i, args[i]);
        }
    }
}
