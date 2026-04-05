public class Count_words {
    public static void main(String[] args) {
        //Using split method
        /*String str="Hi hello how are you";
        String[] arr=str.split(" ");
        System.out.println(arr.length);
        */


       //String with uneven spce b/w words
       /*String str="  Hi      hello ";
       str=str.trim();
       String[] a=str.split("\\s+");
       System.out.println(a.length);
       */

       //Count words without using inbuilt methods
       String str="   Hi  Hello";
       boolean flag=true;
       int count=0;
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch!=' '){
            if(flag){
                count++;
                flag=false;
            }
        }
        else{
            flag=true;
        }
       }
       System.out.println(count);
    }
}
