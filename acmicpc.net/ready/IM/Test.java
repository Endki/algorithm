package ready.IM;
import java.util.Scanner;

class Test
{
   static final int MAX_N = 30;
   static final int MAX_M = 40;
 
   static int[] iAnswer = new int[MAX_M];
   static int[][] iStdAnswer = new int[MAX_N][MAX_M];
      static int N, M;
   static int Answer;

   public static void main(String args[]) throws Exception
   {
      Scanner sc = new Scanner(System.in);

      int T = sc.nextInt();
      for (int test_case = 1; test_case <= T; test_case++)
      {
         N = sc.nextInt();
         M = sc.nextInt();
         for( int i = 0 ; i < M ; i++ )
         {
            iAnswer[i] = sc.nextInt();
         }
         
         for( int i = 0 ; i < N ; i++ )
         {
            for( int j = 0 ; j < M ; j++ )
            {   
               iStdAnswer[i][j] = sc.nextInt();
            }
         }
         
         
            int minScore, maxScore;
            minScore = (int)1e9; maxScore= 0;
            for( int i = 0 ; i < N ; i++ )
         {
                int cnt = 1;
                int sum =0;
            for( int j = 0 ; j < M ; j++ )
            {   
               if(iAnswer[j] == iStdAnswer[i][j]){
                        sum += cnt++;
                    }else
                        cnt = 1;
            }
                if(minScore > sum) minScore = sum;
                if(maxScore < sum) maxScore = sum;
         }
            
         // 표준출력(화면)으로 답안을 출력합니다.
            Answer = maxScore-minScore;
         System.out.println("#" + test_case + " " + Answer);
      }

      sc.close(); // 사용이 끝난 스캐너 객체를 닫습니다.
   }
}