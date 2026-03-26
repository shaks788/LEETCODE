public class Count_1 {
    public static void main(String[] args) {
        String str="Hello@123#";
        int alpha=0,digit=0,special=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) alpha++;
            else if(ch>='0' && ch<='9') digit++;
            else special++;
        }
        System.out.println("Alphabets: "+alpha+" Digits: "+digit+" Special characters: "+special);
    }
    
}
