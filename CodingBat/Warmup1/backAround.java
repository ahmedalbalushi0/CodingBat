package Warmup1;

public class backAround {
    public String backAround(String str) {
        if(str.length()>= 1)
            return str.substring(str.length()-1) + str + str.substring(str.length()-1);
        else
            return str;
    }
}
