package scaler_questions.Scaler;
import java.util.*;
public class AddOneToNumber {

    public static void main(String[] args){

        ArrayList<Integer> A = new ArrayList<>();
        //0, 6, 0, 6, 4, 8, 8, 1
        A.add(0);
        A.add(6);
        A.add(0);
        A.add(6);
        A.add(4);
        A.add(8);
        A.add(8);
        A.add(1);

        ArrayList<Integer> ans = new ArrayList<>();

        ans = plusOne(A);
        for(int i = 0 ; i < ans.size() ;i++){
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> ans = new ArrayList<>() ;
        int carry = 0;
        for(int i = N-1 ; i >= 0 ; i--){
            int val = A.get(i);
            if(i == N-1){
                val = val+1;
                ans.add(0,val%10);
                carry = val/10;
            }
            else{
                val = val + carry;
                ans.add(0,val%10);
                carry = val/10;
            }
        }
        if(carry != 0){
            ans.add(0,carry);
        }

        for(int i = 0 ; i < ans.size() ;i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

        int count = 0 ;
        for(int i = 0 ; i < ans.size() ; i++){
            if(ans.get(i) == 0){
                count++;
            }
            else{
                break;
            }
        }
        while(count > 0){
            ans.remove(0);
            count--;
        }
        return ans;

    }
}
