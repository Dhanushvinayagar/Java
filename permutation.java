public class permutation {
    public static void main(String[] args) {
        String str = "abcd";
        permut(str,"");
    }
    public static void permut(String str, String per) {
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {         
            String newstr = str.substring(0, i)+str.substring(i+1);
            permut(newstr, per+str.charAt(i));
        }
    }
}
