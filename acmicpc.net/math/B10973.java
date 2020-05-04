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
             //1. a[i-1] < a[i]�� �����ϴ� ù ��° �� ã��
            int i = a.length-1;
            while (i > 0 && a[i-1] < a[i]) {
                i -= 1;
            }
 
            // ������ ������ ���
            if (i <= 0) {
                return false;
            }
           //2. a[i-1] < a[j]�� �����ϴ� ù ��° �� ã��
            int j = a.length-1;
            while (a[j] > a[i-1]) {
                j -= 1;
            }
            
            //3. a[i-1]�� a[j] swap
            swap(a, i-1, j);
 
            //4 i���� a.length-1���� ���� ������
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
