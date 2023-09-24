package Java.Challenge04_ExistsHigher;

public class existsHigher {
    public static boolean isHigher(int[] arr, int n)    {
        if (arr.length == 0) return false;
        else {
            for (int i = 0; i < arr.length; i++)    {
                if (arr[i] >= n) return true;
            }
            return false;
        }
    }
}