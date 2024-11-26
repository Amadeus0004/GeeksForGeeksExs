import java.util.Arrays;
class Sorting012 {
    static void sort012(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        sort012(arr);
    }
}
