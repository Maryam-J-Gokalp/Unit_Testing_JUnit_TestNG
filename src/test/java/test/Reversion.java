package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversion {

    public String reverseString(String reverseText){

        String[] string = reverseText.split("");
        List<String> reverse = new ArrayList<>();
        reverse.addAll(Arrays.asList(string));

        Collections.reverse(reverse);
        String str ="";
        for (String a:reverse) {
            str+=a;
        }
        return str;
    }

}
