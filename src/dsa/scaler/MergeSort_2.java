package scaler_questions.Scaler;

public class MergeSort_2 {
    public static void main(String[] args){
        int[] A = {4,1,7,5,-5,3,1,10,11,9};
        int l = 0  ;
        int h = A.length-1 ;
        mergeSort(A,l,h);
        for(int i = 0 ;i < A.length ; i++){
            System.out.print(A[i] + " ");
        }
    }
    static void mergeSort(int[] A, int l , int h){

        if(l==h) return ;
        int mid = (l+h)/2 ;

        mergeSort(A,l,mid);
        mergeSort(A,mid+1,h);

        merge(A,l,mid,h) ;

    }
    static void merge(int[] arr, int l, int mid, int h ){

        //New Array : This new Array makes the Merge Sort with the Space complexity
        // as O(N)
        int[] A1 = new int[mid-l+1] ;
        int[] A2 = new int[h - mid] ;
        for(int i = l,j=0 ; i <= mid ; i++,j++){
            A1[j] = arr[i] ;
        }
        for(int i = mid+1,j=0 ; i <= h ; i++ ,j++){
            A2[j]= arr[i] ;
        }

        int i = 0 ;
        int j = 0 ;
        int k = l ;

        while(i < A1.length && j < A2.length){
            if(A1[i] > A2[j]){
                arr[k] = A2[j] ;
                j++ ;
            }
            else {
                arr[k] = A1[i] ;
                i++ ;
            }
            k++ ;
        }
        while(i < A1.length){
            arr[k] = A1[i] ;
            k++  ;
            i++  ;
        }
        while(j < A2.length){
            arr[k] = A2[j] ;
            k++ ;
            j++ ;
        }
    }
}