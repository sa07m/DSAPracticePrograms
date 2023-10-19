Maximum and minimum of an array using minimum number of comparisons

import java.io.*;
import java.util.*;
 
class Pair {
    public int min;
    public int max;
}
 
class Main {
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n - 1];
        return minmax;
    }
}