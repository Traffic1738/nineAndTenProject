import com.sun.security.jgss.*;

import java.util.*;

public class Parent {
    static ArrayList<Integer> stuff = new ArrayList<Integer>();
    static int mod= 10;
    public static void reverseDisplayRecur(int value){
        int v = value;
        stuff.add(v%10);
        if(v>10) {
            v = (v / 10 * 10) / 10;
            System.out.println(v);
            reverseDisplayRecur(v);
        }


    }
}
