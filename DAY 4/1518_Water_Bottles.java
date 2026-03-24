class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int newB=numBottles/numExchange;
            int remB=numBottles%numExchange;
            total+=newB;
            numBottles=remB+newB;
        }
        return total;
    }
}
