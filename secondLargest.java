
class secondLargest {
    static int getSecondLargest (int[] arr){
        int n = arr.length;
        if (n < 2){
            return -1;
        }

        int largestNumber = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largestNumber){
                secondLargest = largestNumber;
                largestNumber = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largestNumber){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        System.out.println(getSecondLargest(arr));
    }
}
