package de.kohnlehome;

public class SmallestInterface implements ISmallestInterface{

    public int smallestDifference(int[] array1, int[] array2) {
        int smallestDifrence = Math.abs(array1[0]- array2[0]);

        for(int i = 1; i < array1.length; i++){
            for(int y = 0; y < array2.length; y++){
                int difference = Math.abs(array1[i]-array2[y]);
                if(difference < smallestDifrence){
                    smallestDifrence = difference;
                }
            }
        }

        return smallestDifrence;
    }
}
