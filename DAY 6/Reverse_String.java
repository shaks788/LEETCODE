public class Reverse_String{
    public static void main(String[] args){
        String str="abcdef";
        char[] arr=str.toCharArray();
        int l=0;
        int r=str.length()-1;
        while(l<r){
            swap(arr[l],arr[r]);
            l++;
            r--;
        }
        System.out.println(new String(arr));
    }

    public static void swap(char l,char r){
        char temp=l;
        l=r;
        r=temp;
    }
}