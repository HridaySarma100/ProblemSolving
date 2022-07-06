public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,7,5,3,6,4}));
    }

    private static int maxProfit(int[] prices){

        int max = 0,min = Integer.MAX_VALUE;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }



}
