import java.util.*;

public class recursion{
    public static void main(String args[]){

        String str = "malayalam";

        //normal recursion
        String rev = reverse(str,"",str.length()); 
        System.out.println("Reversed string : " + rev);

        //reverse a  string using stack in recursion
        System.out.println("Reverse a string using stack :");
        push(str);
        System.out.println(stackreverse(str, ""));

        //first and last occurace
        System.out.println("\n          Occurance ");
        occurance(str,'a',0,str.length()-1,0,0);

        //sorted array is strictly increaing
        int arr[]={12,13,14,15,16};
        System.out.println("\n\nStrictly increasing array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        boolean b = strictlyincreasing(arr,0,arr.length-1);
        System.out.println("=>"+b);

        //put all x to the end of the string
        str="axbxcxdxx";
        System.out.println("\nPut x to the back of the string :"+str+" as "+strback(str,0,str.length()-1,"")); 

        //remove duplicates in a string
        str="aabbccdefggzzy";
        boolean f[]=new boolean [26];
        Arrays.fill(f,false);
        System.out.println("\nRemove dulicates in a string : " +str+" to "+removeduplicate(str.toUpperCase(),0,str.length(),f));

    }

    //string reversal
    public static String reverse(String str,String str1,int n){
        n--;
        if(0==n){
            return str1+str.charAt(0);
        }
        return reverse(str,str1+str.charAt(n),n);
    }
    
    //string reverse using stack
    static Stack<Character> s = new Stack<>();
    
    static int i=-1;
    public static void push(String str){
        i++;
        if(i==str.length()){
            return;
        }
        s.push(str.charAt(i));
        push(str);
    }
    static int j=-1;
    public static String stackreverse(String str,String str1){
        j++;
        if(j==str.length()){
            if(str.equals(str1)){
                System.out.println("Palindrome");
            }
            return str1;
        }
        return stackreverse(str,str1+s.pop());
    }

    //first and last occurance
    public static void occurance(String str , char ch,int i,int j,int f,int l) {
        if(i==j){
            return;
        }
        if(Character.compare(str.charAt(i),ch)==0 && f==0){
            System.out.println("First occurance "+ i+1);
            f++;
        }
        
        if(Character.compare(str.charAt(j),ch)==0 && l==0){
            System.out.println("Last occurance "+ j+1);
            l++;
        }
        i++;
        j--;
        occurance(str,ch,i,j,f,l);
    }

    //sorted array is strictly increaing
    public static boolean strictlyincreasing(int arr[],int s,int n) {
            if(s==n){
                return true;
            }
            if(arr[s]+1!=arr[s+1]){
                return false;
            }
            if(arr[n]-1!=arr[n-1]){
                return false;
            }
            s++;
            return strictlyincreasing(arr, s, n);            
    }
    static int count=0;
    
    //put x to back string
    public static String strback(String str,int i,int n,String str1){

        if(i==n){
           
            while(count>=0){
                str1+="x";
                count--;
            }
            return str1;
        }
        if(Character.compare(str.charAt(i),'x')==0){
            count++;
        }else{
            str1+=str.charAt(i);
        }
        i++;
        return strback(str,i,n,str1);
    }

    //remove dulicates from the string 
  
    public static String removeduplicate(String str , int i ,int n,boolean f[]){
        if(i==n){
            String str1="";
            for(j=0;j<26;j++){
                if(f[j]==true){
                    char ch = (char)('a'+j);
                    str1+=ch;
                }
            }
            return str1;
        }
        if(!(f[str.charAt(i)-65])){
            f[str.charAt(i)-65]=true;
        }
        return removeduplicate(str, i+1, n,f);
    }
}