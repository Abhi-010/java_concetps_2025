package scaler_questions.Scaler;
import java.util.*;

class Interval{
    int start;
    int end ;
    Interval(){
        start = 0;
        end = 0;
    }
    Interval(int s , int e){
        start = s;
        end = e;
    }
}
public class MergeInterval {

    public static void main(String[] args){

        //ArrayList<Interval> output = insert();
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> inputIntervals, Interval newInterval) {

        ArrayList<Interval> res = new ArrayList<>() ;
        int size = inputIntervals.size() ;

        int l = newInterval.start ;
        int r = newInterval.end ;

        if(size == 0){
            res.add(newInterval)  ;
            return res ;
        }
        if(r < inputIntervals.get(0).start){
            inputIntervals.add(0,newInterval);
            return inputIntervals ;
        }

        if( l > inputIntervals.get(size-1).end){
            inputIntervals.add(size,newInterval) ;
            return inputIntervals ;
        }

        boolean first_overlap = true ;
        int nS = -1 ;
        int nE = -1 ;
        //l : insert interval start
        //r : insert interval end

        for(int i = 0 ; i < size ; i++){
            int s = inputIntervals.get(i).start ;
            int e = inputIntervals.get(i).end  ;

            if(e < l || s > r){
                //non-overlapping
                if(nS != -1 && nE != -1){
                    Interval merge = new Interval(nS,nE) ;
                    res.add(merge) ;
                    nS = -1 ;
                    nE = -1 ;
                }
                res.add(inputIntervals.get(i)) ;
            }
            else{
                //overlapping
                if(first_overlap){
                    if(s < l){
                        nS = s ;
                    }
                    else{
                        nS = l ;
                    }

                    if(e > r){
                        nE = e;
                    }
                    else{
                        nE = r ;
                    }
                    first_overlap = false ;
                }
                else{
                    if(e > r){
                        nE = e ;
                    }
                    else{
                        nE = r ;
                    }
                }
            }
        }
        if(nS != -1 && nE != -1){
            Interval merge = new Interval(nS,nE) ;
            res.add(merge) ;
        }

        if(first_overlap == true){
            for(int i = 0 ; i < size-1 ; i++){
                if(inputIntervals.get(i).end < newInterval.start){
                    if(newInterval.end < inputIntervals.get(i+1).start){
                        res.add(i+1,newInterval);
                        break ;
                    }
                }
            }
        }
        return res ;
    }
}
