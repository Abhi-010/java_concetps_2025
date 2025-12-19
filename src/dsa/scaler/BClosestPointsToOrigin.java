package scaler_questions.Scaler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ArrNumber implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        int d1 = list1.get(0)*list1.get(0) + list1.get(1)*list1.get(1) ;
        int d2 = list2.get(0)*list2.get(0) + list2.get(1)*list2.get(1) ;

        if(d1 > d2) return 1 ;
        if(d1 < d2) return -1 ;
        return 0 ;

    }
}

public class BClosestPointsToOrigin {
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> list = new ArrayList<>() ;

        ArrayList<Integer> index1 = new ArrayList<>();
        index1.add(1);
        index1.add(3) ;

        ArrayList<Integer> index2 = new ArrayList<>();
        index2.add(-2);
        index2.add(2) ;

        list.add(index1) ;
        list.add(index2) ;

        Collections.sort(list,new ArrNumber());

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>() ;
        for(int i = 0 ; i <= 1 ; i++){
            res.add(list.get(i)) ;
        }

        System.out.print(res.get(0).get(0) + " ");
        System.out.print(res.get(0).get(1)+ " ");

        /*
        System.out.print(list.get(0).get(0) + " ");
        System.out.print(list.get(0).get(1)+ " ");

        System.out.print(list.get(1).get(0) + " ");
        System.out.println(list.get(1).get(1) );



        System.out.print(list.get(0).get(0) + " ");
        System.out.print(list.get(0).get(1) + " ");

        System.out.print(list.get(1).get(0)+ " ");
        System.out.print(list.get(1).get(1));

        */




    }
}
