class Math{
    public static double PI = 3.14; //is the static whose default value is 3.14
    
    public static int abs(int x){ // is the function that returns the absolute value of x
        if (x < 0) return -x;
        return x;
    }
    
    public static int add(int x, int y){ // is the function that returns the sum of x and y
        return x + y;
    }
    
    public static int subtract(int x, int y){ // is the function that return the subtraction of x and y
        return x - y;
    }
    
    public static int min(int x, int y){ // is the function that returns the smaller of two numbers
        if (x > y) return y;
        return x;
    }
    
    public static int max(int x, int y){ // is the function that returns the greater of 2 numbers 
        if (x > y) return x;
        return y;
    }
    
    public static int pow(int x, int y){ // is the function that returns the result of x^y
        int power = 1;
        for (int i = 0; i < y; i++)
            power *= x;
        return power;
    }
}