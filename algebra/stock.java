class stock {
    //Approach : Keep track of minimum value(buying price) and keep updating the value for profit as we traverse through the array
    //Time Complexity: O(n)
    public void bestTime(int[] prices){
        int buyingDay = 0; //change this value whenever soFarMin is updated to keep track of buying day
        int sellingDay = 0; //change this value when updating the value for profit
        int j = 0; int i = 0;
        if(prices.length == 0){
            System.out.println("No prices exist");
        }
        int soFarMin = Integer.MAX_VALUE; //initial minimum value for price
        int profit = 0; //variable keep track of profit after selling
        for(i = 0; i < prices.length; i++){
            if(prices[i] < soFarMin){
                soFarMin = prices[i];
                j = i;
            } else if(profit < prices[i] - soFarMin){
                buyingDay = j+1;
                sellingDay = i+1;
                profit = prices[i] - soFarMin;
            }
        }
        System.out.println("Buying Day: " + buyingDay);
        System.out.println("Selling Day: " + sellingDay);
        System.out.println("Total Gain: " + profit);
    }
    public static void main(String[] args) {
        stock obj = new stock();
        //Array for prices as input
        int[] arr = {3, 8, 8, 55, 38, 1, 7, 42, 54, 53};
        obj.bestTime(arr);
    }
}