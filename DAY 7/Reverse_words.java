public class Reverse_words {
    public static void main(String[] args) {
        String str="Hi Hello Great";
        String s="",word="";

        for(int i=0;i<str.length();i++){
            word=" ";
            char ch=str.charAt(i);

            if(ch!=' '){
                word=word+ch;
            }
            else{
                s=word+" "+s;
            }
        }
        s=word+" "+s;
        System.out.println(s);
    }
}
