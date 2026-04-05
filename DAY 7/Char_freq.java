public class Char_freq {
    public static void main(String[] args) {

        //Frequency without tracking array
        String str="Hi HH good";
        boolean flag;
        int count;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            flag=false;

            for(int j=0;j<i;j++){
                if(ch==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag) continue;
            count=1;
            for(int k=i+1;k<str.length();k++){
                if(str.charAt(k)==ch){
                    count++;
                }
            }

            System.out.print(ch+" : "+count);
        }
    }
    
}
