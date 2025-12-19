package scaler_questions.Scaler;

public class MergeSort {
    public static void main(String[] args){
        //int[] A = {4,3,1,2,99,56,90,11,12,34,5,1,2} ;
        int[] A = {2000000000, 2000000000 ,-2000000000};
        //int[] A = {4,1,2};
        int l = 0  ;
        int h = A.length-1 ;
        System.out.println(mergeSort(A,l,h));

        for(int i = 0 ;i < A.length ; i++){
            System.out.print(A[i] + " ");
        }
    }
    static int mergeSort(int[] A, int l , int h){
        if(l==h) return 0 ;
        int mid = (l+h)/2 ;
        int count = 0 ;
        count += mergeSort(A,l,mid);
        count += mergeSort(A,mid+1,h);
        int p1 = l ;
        int p2 = mid + 1 ;
        while(p1<=mid && p2<=h){
            long val1 = A[p1] ;
            long val2 = (long)2*A[p2] ;
            System.out.println("val1 : " + val1);
            System.out.println("val2 : " + val2);
            //if((long)A[p1] > (long)2*A[p2]){
            if(val1 > val2){
                count+=(mid-p1+1) ;
                p2++ ;
            }
            else {
                p1++ ;
            }
        }
        merge(A,l,mid,h) ;
        return count;
    }
    static void merge(int[] arr, int l, int mid, int h ){
        int[] A1 = new int[mid-l+1] ;
        for(int i = l,j=0 ; i <= mid ; i++,j++){
            A1[j] = arr[i] ;
        }
        int[] A2 = new int[h - mid] ;
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