class Solution {
    public int findNthDigit(int n) {
        long digit=1;
        long count=9;
        long start=1;

        while(n>digit*count){
            n-=digit*count;
            digit++;
            count*=10;
            start*=10;
        }

        long num=start+((n-1)/digit);
        String s=Long.toString(num);
        char ch=s.charAt((int)((n-1)%digit));

        return ch-'0';
    }
}