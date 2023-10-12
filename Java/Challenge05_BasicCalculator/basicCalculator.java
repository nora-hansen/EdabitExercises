package Java.Challenge05_BasicCalculator

/**
 * A basic calculator
 * Returns 0 if there is an attempt to divide by 0 ,`:)
 */
public class basicCalculator    {
    public static int calculator(int  num1, char operator, int num2)    {
        int result = 0;
        switch(operator)    {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': {
                if (num2 == 0) result = 0;
                else result = num1 / num2;
            }   break;
            default: result = 0;
        }
        return result;
    }
}