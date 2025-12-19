package scaler_questions.Scaler;

public class ReversePairs {

    public static void main(String[] args) {
        int [] A = {4,1,2} ;
        //solve(A) ;
        System.out.println(solve(A)) ;
        for(int i = 0 ; i < A.length ; i++){
            System.out.print(A[i] + " ");
        }

    }
        public static int solve(int[] A) {
            int l = 0 ;
            int r = A.length - 1;
            int[] ans = new int[1] ;
            if(l==r) return 0 ;
            MergeSort(A,l,r,ans) ;
            return ans[0] ;
        }

        public static void MergeSort(int[]A, int l, int r,int[] ans){
            if(l>=r) return ;
            int mid = (l+r)/2 ;
            MergeSort(A,l,mid,ans) ;
            MergeSort(A,mid+1,r,ans) ;
            Merge(A,l,mid,r,ans) ;
        }

        static void Merge(int[]A, int l, int mid,int r,int[] ans){
            int i = 0 ; //this will go till mid
            int j = mid+1 ; //this will go till
            int k = 0 ;

            int count = 0 ;

            while(i<=mid && j <= r){
                if(A[i] > 2*A[j]){
                    int ele_count = mid-i+1 ;
                    count = count + ele_count ;
                    j++ ;
                }
                else{
                    i++ ;
                }
            }
            ans[0] = ans[0] + count ;

            while(i<=mid && j <= r){
                if(A[i] <= A[j]){

                }
                else{
                    int temp = A[i] ;
                    A[i] = A[j] ;
                    A[j] = temp ;
                }
                i++ ;
                k++ ;
            }
            while(i<=mid){
                A[k] = A[i] ;
                i++ ;
                k++ ;
            }
            while(j<=r){
                A[k] = A[j] ;
                j++;
                k++;
            }
        }
    }
