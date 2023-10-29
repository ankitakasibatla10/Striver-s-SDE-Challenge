public class NonZero {

    public static int[] moveZero(int n, int[] a){
        int j = -1;
        for(int i=0; i<n; i++){
            if(a[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return a;
        //swapping
        for(int i=j+1; i<n; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans  = moveZero(n, arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
