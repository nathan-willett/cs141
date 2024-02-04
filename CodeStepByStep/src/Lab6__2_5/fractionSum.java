package Lab6__2_5;

public static double fractionSum(int n) {
    int denominator = 1;
    double sum = 0.0;
    for(int i = 0; i <= n; i++) {
        sum += (double) 1 / denominator;
    }
    return  sum;
}