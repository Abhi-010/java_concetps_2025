package dsa.codechef.codechef;

import java.util.Scanner;

public class VaccineDrive {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt()  ;
        while(testCases-- != 0){

            int[] ageGroup = new int[11] ;

            int chefAgeGroup = sc.nextInt() ;
            int vaccinePerDay = sc.nextInt() ;

            for(int i = 1 ; i < 11 ; i++){
                ageGroup[i] = sc.nextInt() ;
            }
            int index = 10 ;
            int daysToTakeVaccine = 0 ;
            int minDayForChef =  0 ;
            int maxDayForChef = 0 ;
            int vaccineLeftOnDay = vaccinePerDay ;
            while(index != 0){
                if(chefAgeGroup == index){
                    minDayForChef = daysToTakeVaccine + 1 ;

                    if(ageGroup[index] <= vaccineLeftOnDay){
                        maxDayForChef = daysToTakeVaccine + 1 ;
                    }
                    else {
                        maxDayForChef = daysToTakeVaccine + 2 ;
                    }
                    break;
                }

                if(vaccineLeftOnDay == ageGroup[index]){
                    daysToTakeVaccine++;
                    vaccineLeftOnDay = vaccinePerDay ;
                    index-- ;
                }
                else if(vaccineLeftOnDay < ageGroup[index]){
                    ageGroup[index] = ageGroup[index] - vaccineLeftOnDay ;
                    daysToTakeVaccine++;
                    vaccineLeftOnDay = vaccinePerDay ;
                }
                else if(vaccineLeftOnDay > ageGroup[index]){
                    vaccineLeftOnDay = vaccineLeftOnDay - ageGroup[index] ;
                    index-- ;
                }
            }
            System.out.println(minDayForChef + " " + maxDayForChef);
        }
    }
}
