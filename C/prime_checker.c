#include <stdio.h>

int isPrime(int n) {
    if (n <= 1) {
        return 0;  // Not prime
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return 0;  // Not prime
        }
    }
    return 1;  // Prime
}

int main() {
    int num;
    printf("Enter a number to check if it's prime: ");
    scanf("%d", &num);
    if (isPrime(num)) {
        printf("%d is a prime number\n", num);
    } else {
        printf("%d is not a prime number\n", num);
    }
    return 0;
}
