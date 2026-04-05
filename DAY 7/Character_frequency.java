public class Character_frequency {
    public static void main(String[] args) {

        //Using frequency array
        String str="Hi Guys Hello#";
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.print((char)i+" : "+freq[i]);
            }
        }
    }
    
}
