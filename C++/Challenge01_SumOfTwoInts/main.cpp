#include <iostream>

int addition(int a, int b);

int main()  {
    std::cout << addition(2, 100);

    return 0;
}

/**
 *  Return the Sum of Two Numbers
 *
 *  @author Nora Hønnåshagen Hansen
 *  @date   2023-09-18
 */
 int addition(int a, int b) {
    return (a + b);
 }