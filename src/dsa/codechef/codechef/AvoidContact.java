package dsa.codechef.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AvoidContact {
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in) ;

        int testCases = Integer.parseInt(br.readLine()) ;
        while(testCases != 0){

            String st = br.readLine() ;

            String[] str = st.split(" ") ;

            int[] arr = new int[2] ;

            for(int i = 0 ; i < str.length ; i++){
                arr[i] = Integer.parseInt(str[i]) ;
            }

            int totalPeople = arr[0] ;
            int infectedPeople = arr[1] ;

            int nonInfectedPeople = totalPeople - infectedPeople ;

            int minRooms = 0 ;

            if(infectedPeople == 0){
                minRooms = totalPeople ;
            }
            else if(totalPeople == infectedPeople) {
                minRooms = 2*infectedPeople - 1 ;
            }
            else
                minRooms = 2*infectedPeople + nonInfectedPeople  ;

            System.out.println(minRooms) ;
            testCases-- ;
        }
    }
}
