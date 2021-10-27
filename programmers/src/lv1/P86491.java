package lv1;

public class P86491 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int horizontal=0;
        int vertical=0;
        
        
        
        for(int i=0;i<sizes.length;i++){
            int max=Math.max(sizes[i][0],sizes[i][1]);
            int min=Math.min(sizes[i][0],sizes[i][1]);
            
            horizontal=Math.max(horizontal,max);
            vertical=Math.max(vertical,min);
        }
        
        answer=horizontal*vertical;
        return answer;
    }
}
