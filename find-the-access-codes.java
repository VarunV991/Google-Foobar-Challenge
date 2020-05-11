public class Solution {
    public static int solution(int[] l) {
        // Creating counter for each index which will store count of numbers which divide it and have lesser index
        int[] c = new int[l.length];
	    c[0] = 0;
	    int result = 0;


        for(int i = 1;i<l.length;i++){
            for(int j = 0;j<i;j++){
                // If the number is divisible then inc the count in the counter.
                if(l[i]%l[j]==0){
                    c[i]++;

                    // If the a is divisible by b, then no. of triplets formed will be the count of b.
                    result+=c[j];
                }
            }
        }
        return result;
    }
}