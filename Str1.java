public class Str1 {
    public static void main(String[] args) {
        String str1="The Best of Both Words";
        int n=str1.length();
        int Count=0;

        for(int i=0;i<n;++i){
            if(str1.charAt(i)==' '){
                continue;
            }
            else{
                Count++;
            }


        }
        System.out.println(Count);

    }
}
