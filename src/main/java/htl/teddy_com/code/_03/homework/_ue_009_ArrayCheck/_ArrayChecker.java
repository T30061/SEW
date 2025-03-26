package htl.teddy_com.code._03.homework._ue_009_ArrayCheck;

import java.util.ArrayList;
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

    //extra
    public boolean contains(int[] arr1, int[] arr2){
        if(arr1.length > arr2.length){
            ArrayList<Integer> ar = new ArrayList<>();
            for(int el : arr1)
                ar.add(el);
            for(int num : arr2) {
                if (!ar.contains(num))
                    return false;
            }
        }
        return true;
    }

    public int prent(int[] arr){
        int mittel = 0;
        int numbs = 0;
        for(int mid : arr){
            mittel = mittel+ mid;
        }
        mittel = mittel / arr.length;

        for(int prenc : arr){
            if(prenc > (int) (mittel * 1.1D)){
                numbs++;
            }
        }
        return numbs;
    }

    public void histo(int[] arr){
        for(int el : arr){
            System.out.println("*".repeat(el));
        }
    }
}
