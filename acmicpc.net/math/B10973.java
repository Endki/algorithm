package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10973 {

    public static void swap(int [] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
     public static boolean nextPermutation(int[] a) {
             //1. a[i-1] < a[i]를 만족하는 첫 번째 수 찾기
            int i = a.length-1;
            while (i > 0 && a[i-1] < a[i]) {
                i -= 1;
            }
 
            // 마지막 순열인 경우
            if (i <= 0) {
                return false;
            }
           //2. a[i-1] < a[j]를 만족하는 첫 번째 수 찾기
            int j = a.length-1;
            while (a[j] > a[i-1]) {
                j -= 1;
            }
            
            //3. a[i-1]과 a[j] swap
            swap(a, i-1, j);
 
            //4 i부터 a.length-1까지 순열 뒤집기
            j = a.length-1;
            while (i < j) {
                swap(a, i, j);
                i += 1;
                j -= 1;
            }
            return true;
        }
        public static void main(String args[]) throws IOException{
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] input=br.readLine().split(" ");
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            if (nextPermutation(arr)) {
                for (int i=0; i<n; i++) {
                    System.out.print(arr[i] + " ");
                }
            } 
            else {
                System.out.println("-1");
            }
        }

}
