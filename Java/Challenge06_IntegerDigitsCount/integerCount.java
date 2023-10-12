package Java.Challenge06_IntegerDigitsCount

public class integerCount   {
    public static int count(int num)    {
        int count = 0;
        if (num > 0)    {   // Is a positive integer
            while (num > 10)    {
                num /= 10;
                count++;
            }
        }
        else {   // Is a negative integer
            while (num < -10)    {
                num /= 10;
                count++;
            }
        }
        return count;
    }
}
