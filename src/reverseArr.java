public class reverseArr {
//    static void arr(int arr[], int n){
//        for(int i = 0; i < n; i++){
//            System.out.println(arr[i]);
//        }
//    }
//    static void arrR(int ar[], int n){
//        int[] arr = new int[n];
//        for(int i=n-1; i >= 0; i--){
//            arr[n-i-1] = ar[i];
//        }
//        arr(arr, n);
//    }
    public static void main(String[] args){
//        int n = 7;
//        int arr[] = {1, 2, 3, 4, 5, 6, 7};
////        arrR(ar, n);
//        int[] ans = revArr(arr, n);
//        System.out.println(ans);

        // recursive way

//        static void reverseArray(int arr[], int start, int end) {
//            if (start < end) {
//                int tmp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = tmp;
//                reverseArray(arr, start + 1, end - 1);
//            }
//        }
//        public static void main(String[] args) {
//            int n = 5;
//            int arr[] = { 5, 4, 3, 2, 1};
//            reverseArray(arr, 0, n - 1);
//            printArray(arr, n);
//        }

        int m = 5;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
//        arrR(ar, n);
        int[] ans = revArr(arr, m);
        System.out.println(ans);

    }
    public static int[] revArr(int[] arr, int m){
        int i = 0;
        int j = m-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
