package htl.teddy_com.code._03.homework._ue_009_ArrayCheck;

public class _Main_ArrayChecker {

    public static void main(String[] args) {
        _ArrayChecker ac = new _ArrayChecker();

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 3, 4, 5};

        System.out.println(ac.isArrayContnuous(array1));
        System.out.println(ac.isArrayContnuous(array3));
    }
}
