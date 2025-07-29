package Warmup1;

public class stringE {
    public boolean stringE(String str){
        int count = 0;

        for (int i = 0; str.length()>i; i++){
            if (str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <= 3 );
    }
}
