public class Count {
    public static void main(String[] args) {
        String str="computer";
        int v=0,c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println("Vowel: "+v+" Consonants: "+c);
    }
}
