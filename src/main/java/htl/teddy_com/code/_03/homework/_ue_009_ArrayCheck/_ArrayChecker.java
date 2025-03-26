package htl.teddy_com.code._03.homework._ue_009_ArrayCheck;

import java.util.Arrays;

public class _ArrayChecker {

    public boolean isArrayContnuous(int[] input){
        if(input == null || input.length == 0)
            return false;
        Arrays.sort(input);
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] + 1 != input[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int countOcc(int n, int[] a){
        int times = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)
                times++;
        }
        return times;
    }
}
