public class Palindrome {
    public static void main(String[] args){
        String str="racecar";
        palindrome(str);
    }

    public static boolean palindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
