package arrays101;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int peekIndex=-1;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                peekIndex=i;
                break;
            }
        }

        if(peekIndex==0 || peekIndex==arr.length-1){
            return false;
        }
        
        for(int i=0;i<peekIndex-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
            
        }
        
        for(int i=peekIndex;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
