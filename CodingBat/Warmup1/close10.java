package Warmup1;

public class close10 {
    public int close10(int a, int b) {
        if(Math.abs(a - 10)<(Math.abs(b - 10)))
            return a;

        if(Math.abs(a - 10)>(Math.abs(b - 10)))
            return b;

        else
            return 0;
    }
}
