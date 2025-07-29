package Logic1;

public class more20 {
    public boolean more20(int n) {
        int result =(Math.abs(n%20));
        if((result==1) || (result==2))
            return true;
        else
            return false;
    }
}
