package SortingAlgorithms.Java;

import java.util.Random;

public class Utilities {
    
    public static int[] randomInts(int low, int high, int n)
    {
        Random random = new Random();
        int[] output = new int[n];
        for(int i=0;i<n;i++)
        {
            output[i] = random.nextInt(low,high);
        }
        return output;
    }

    public static float[] randomFloats(int low, int high, int n)
    {
        Random random = new Random();
        float[] output = new float[n];
        for(int i=0;i<n;i++)
        {
            output[i] = random.nextFloat(low,high);
        }
        return output;
    }
    
}
