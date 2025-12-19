package dsa.codechef.codechef;

import java.util.Scanner;

public class VaccineDrive2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- != 0) {
            int[] ageGroup = new int[11];
            int chefAgeGroup = sc.nextInt();
            int vaccinePerDay = sc.nextInt();
            for (int i = 1; i < 11; i++) {
                ageGroup[i] = sc.nextInt();
            }
            funcToSolve(ageGroup, chefAgeGroup, vaccinePerDay);
        }
    }

    static void funcToSolve(int[] ageGroup, int chefAgeGroup, int vaccinePerDay) {

        long totalPeople = 0;
        for (int i = 10; i > chefAgeGroup; i--) {
            totalPeople = totalPeople + ageGroup[i];
        }

    }
}




