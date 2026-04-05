public class Remove_duplicates {
    public static void main(String[] args) {
        String str="Programming";
        String res="";
        boolean flag=false;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=0;j<i;j++){
                if(ch==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                res=res+ch;
            }
        }
        System.out.println(res);
    }
}
