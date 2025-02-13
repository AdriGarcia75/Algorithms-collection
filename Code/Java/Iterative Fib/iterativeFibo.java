public static long iterativeFibo(long num){
    long a = 0; long b = 1; long temp;
    if (num == 0){
        return a;
    }
    for (long i = 2; i <= num; i++) {
        temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}