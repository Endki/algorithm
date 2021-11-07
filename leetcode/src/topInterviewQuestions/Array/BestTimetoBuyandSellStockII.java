package topInterviewQuestions.Array;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		int[] prices=new int[]{7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 1;i<prices.length;i++) {
        	sum += Math.max(0, prices[i] - prices[i - 1]);
        }
        return sum;
    }
}
