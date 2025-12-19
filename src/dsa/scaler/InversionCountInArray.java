package scaler_questions.Scaler;

public class InversionCountInArray {
    public static int globalCount = 0;
    public static void main(String[] args){
        int[] A = {28, 18, 44, 49, 41, 14 };
        mergeSort(A,0,A.length-1);
        System.out.println();
        System.out.println(globalCount) ;

    }
    static void mergeSort(int[] arr, int s , int e){
        if(s == e) return ;
        int mid = (s+e)/2 ;
        mergeSort(arr,s,mid) ;
        mergeSort(arr,mid+1,e) ;
        int count = merge(arr,s,mid,e) ;
        /*
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }*/
        //System.out.println();
        globalCount = globalCount + count ;
    }
    static int merge(int[] arr, int s, int mid, int e){
        int count = 0 ;
        int[] A1 = new int[mid-s+1] ;
        int index = 0 ;
        for(int i = s ; i <= mid ; i++){
            A1[index++] = arr[i] ;
        }
        int[] A2 = new int[e-mid] ;
        index = 0 ;
        for(int i = mid+1 ; i <= e ; i++){
            A2[index++] = arr[i] ;
        }
        int i = 0 , j = 0 , k = s ;
        while(i < A1.length && j < A2.length){
            if(A1[i] <= A2[j]){
                arr[k] = A1[i] ;
                i++ ;
            }
            else {
                arr[k] = A2[j] ;
                count = count + (A1.length-i) ;
                j++ ;
            }
            k++;
        }
        while (i < A1.length){
            arr[k] = A1[i] ;
            i++ ;
            k++ ;
        }
        while(j < A2.length){
            arr[k] = A2[j] ;
            j++ ;
            k++ ;
        }
        return count ;
    }
}
