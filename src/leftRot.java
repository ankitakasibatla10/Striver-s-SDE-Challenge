public class leftRot {

     static void left_rotate(int[] arr, int n){
        int temp = arr[0];

        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;

        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        left_rotate(arr, n);
    }

}
