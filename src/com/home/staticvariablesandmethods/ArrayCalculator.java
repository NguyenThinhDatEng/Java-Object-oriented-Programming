class ArrayCalculator {
    public static int sumOfArray(int arr[]){ // is a static method which the input is an array of integers and it returns the sum of this
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    
    public static double sumOfArray(double arr[]) // is a static method which the input is an array of double numbers and it returns the sum of this
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    
    public static int maxOfArray(int arr[]) // is a static method which the input is an array of integers and it returns the largest value in array
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
    
    public static double maxOfArray(double arr[]) 
    {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
    
    public static int minOfArray(int arr[]) // is a static method which the input is an array of integers and it returns the smallest value in array
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
    
    public static double minOfArray(double arr[])
    {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
}