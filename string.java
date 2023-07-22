public class string {
    public static void main(String[] args) {
        //string 
        String str="Dhanush";
        System.out.println("String : "+str);
        
        //uppercase
        System.out.print("Uppercase :"+ str.toUpperCase());

        //lowercase
        System.out.println("  Lowercase :"+str.toLowerCase());

        //each character
        System.out.print("String each character : ");
        for(int i=0 ;i<str.length();i++){
            System.out.print(str.charAt(i));
        }

        //string to string array
        String arr[] = str.split("");
        System.out.print("\nArray : "+arr);
        for(String i : arr){
            System.out.print(i);
        }

        //To character array
        char array[] = str.toCharArray();
        System.out.print("\nCharacter array :"+array+" ");
        for(char i : array){
            System.out.print(i);
        }
        //string array to string
        String a[]={"Word","is","word"};
        str="";
        for(int i=0;i<a.length;i++){
            str+=a[i].toString()+" ";
        }
        System.out.print("\nString array to string :"+str);

        //join ("seperator" ,elements)
        str=str.join(" ","Word","is","Word");
        System.out.println("\nJoin string :"+str);

        //string replace
        str="Dhanush";
        str.replace("h", "h K");
        System.out.println("String replace :"+str);
        

        //replace all identical string
        str="word is a word";
        str=str.replaceAll("word", "Work");
        System.out.println("String replaceall : "+str);

        //trim - removes the one whitespaces from both ends  ,strip removes all whitespaces both sides
        str="   Dhanush    ";
        System.out.print("From :"+str);
        str=str.trim();
        System.out.print(" To:"+str);
        str=str.strip();
        System.out.println(" To:"+str);

        //concatenation
        str=str.concat(" Kandasamy");
        System.out.println("Concatenation : "+str);

        str="Dhanush";
        str+="Kandasamy";
        System.out.println("Concat using + "+str);

        str+=2002; //number
        System.out.println("String number concat :"+str);

        //compare two strings and return the difference
        str="man";
        System.out.println("String difference :"+str.compareTo("woman"));
        System.out.println("String difference :"+str.compareToIgnoreCase("MAN"));
        
        //check two strings is similar
        str="man";
        System.out.println("String equals :"+str.equals("woman"));
        System.out.println("String equals :"+str.equalsIgnoreCase("MAN"));
        
        //String contains
        str="Work is work";
        System.out.println("String contains :"+str.contains("is"));

        //substring
        str="golbe-world";
        System.out.println("Substring :"+str.substring(6,11));

           
    }
}
