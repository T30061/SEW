package htl.teddy_com.code.extra;

import java.util.ArrayList;

public class Extra_26_03 {

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
