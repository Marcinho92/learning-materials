package com.interview.exercises.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {

    public static void main(String[] args) {

//        minimumBribes(new ArrayList<>(List.of(1, 2, 3, 5, 4, 6, 7, 8)));
//        minimumBribes(new ArrayList<>(List.of(4, 1, 2, 3)));
//        minimumBribes(new ArrayList<>(List.of(2, 1, 5, 3, 4)));
//        minimumBribes(new ArrayList<>(List.of(2, 5, 1, 3, 4)));
        minimumBribes(new ArrayList<>(List.of(1, 2, 5, 3, 7, 8, 6, 4)));

    }

    private static void minimumBribes(List<Integer> q) {
//        int n = q.size();
//
//        int counter = 0;
//        for (int i = 0; i < n; ++i) {
//            int curDif = q.get(i) - (i + 1);
//            if (curDif > 2) {
//                System.out.println("Too chaotic");
//                return;
//            } else {
//                if (i == 0) {
//                    counter += curDif;
//                } else if (i == 1 && q.get(1) > q.get(0)) {
//                    counter += curDif;
//                } else if (i > 1 && q.get(i) > q.get(i - 1) && q.get(i) > q.get(i - 2)) {
//                    counter += curDif;
//                }
//            }
//        }
//
//        System.out.println(counter);




        int bribe = 0;
        for (int i = q.size()-1; i > 0; i--){
            if (q.get(i) != i+1){
                if (q.get(i-1) == i+1){
                    int temp = q.get(i-1);
                    q.set(i-1, q.get(i));
                    q.set(i, temp);
                    bribe++;
                }
                else if (q.get(i-2) == i+1){
                    int temp = q.get(i-2);
                    q.set(i-2, q.get(i-1));
                    q.set(i-1, q.get(i));
                    q.set(i, temp);
                    bribe += 2;
                }
                else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bribe);
    }

}