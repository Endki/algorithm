package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 금고털이 {
	static int N,W,money;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stz=new StringTokenizer(br.readLine());

        W=Integer.parseInt(stz.nextToken());
        N=Integer.parseInt(stz.nextToken());
        int[][] arr=new int[N][2];
        for(int i=0;i<N;i++){
            stz=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(stz.nextToken());
            arr[i][1]=Integer.parseInt(stz.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[] o2){
                    return o2[1]-o1[1];
            }
        });
        
        int answer=0;
        for(int i=0;i<N;i++){
            if(W-arr[i][0]>=0){
                W-=arr[i][0];
                answer+=(arr[i][0]*arr[i][1]);
            }else{
                for(;W>0;W--){
                    answer+=arr[i][1];
                }
            }
        }


        System.out.println(answer);
    }
}
