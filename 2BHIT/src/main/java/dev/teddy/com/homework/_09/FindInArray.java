package dev.teddy.com.homework._09;

public class FindInArray {

    public static void main (String[] args){
        int[] array = {2,3,4,5,6,};
        int seached = 2;
        
        for(int i : array){
            if(i == seached)
                System.out.println("IN ARRAY");
        }
    }

}