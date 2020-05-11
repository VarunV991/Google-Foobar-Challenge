public class Solution {
    static int total = 0;
    public static int solution(int n) {
        step(1,n);
        int res = total;
        total = 0;
        return res;
    }

    public void step(int a, int b){
        int[] arr = new int[b-a];
        // Making an array of all possible numbers between a and b;
        for(int i = a;i<b;i++){
            arr[i]=i;
        }
        // If we combine the first half of the array with the next half, the condition is satisfied b < a
        int len = arr.length/2;
        // So, we add half of the length of the array to the total;
        total+=len;

        /* There is a possibility that b can be split into more parts which may satisfy the condition b1 < b2 < a */

        for(int i = 0;i<len;i++){
            // Inc. the 'a' value
            na = arr[0]+1;
            // b value is reduced by subtracting the a value from it;
            nb = arr[arr.length-1]-arr[0];

            // the values from the range a to b gives the option available to us to split the b
            // if a > b, no more split is possible 
            if(na<nb){
                step(na,nb);
            }
            else{
                break;
            }
        }
    }
}