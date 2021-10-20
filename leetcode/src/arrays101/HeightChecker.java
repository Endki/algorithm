package arrays101;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] arr=heights.clone();
        
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
