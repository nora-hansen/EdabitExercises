import java.util.*;

public class arrayOfMultiples   {
    public static int[] multiples(int num, int length)   {
        int arr[] = new int[length];
        for(int i = 0; i <= length; i++)    {
            arr[i] = num * (i+1);
        }
        return arr;
    }
}