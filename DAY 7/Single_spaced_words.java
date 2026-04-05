public class Single_spaced_words {
    public static void main(String[] args) {
        String str="Hi       Hello   Great";
        String s="";
        boolean flag=false;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                s=s+ch;
                flag=false;
            }
            else{
                if(!flag){
                    s=s+ch;
                    flag=true;
                }
            }
        }
        System.out.println(s);
    }
}
