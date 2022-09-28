package com.vaibhav.coding.array;

public class OlympicGames {
    public static void main(String[] args) {
        int[] medals = new int[]{0,0,1,0,2,1,1,1,1,15,1};

        int zeroes = 0;
        int totalMedals = 0;
        int lastThree = 0;
        for (int i = 0; i<medals.length; i++){
            if(medals[i] == 0){
                zeroes += 1;
            }
            if(i == medals.length-4){
                for(int k = medals.length-4; k<medals.length; k++){
                    lastThree = lastThree + medals[k];
                }
            }
            totalMedals = totalMedals + medals[i];
        }
//        System.out.println(zeroes);
//        System.out.println(totalMedals);
//        System.out.println(lastThree);

        // now, pushing all three integers in an array and printing it :
        int[] arrFinal = new int[3];
        arrFinal[0] = zeroes;
        arrFinal[1] = totalMedals;
        arrFinal[2] = lastThree;

        for (int items = 0; items<arrFinal.length; items++){
            System.out.println(arrFinal[items]);
        }
    }
}
