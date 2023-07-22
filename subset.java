import java.util.ArrayList;
public class subset {

    public static void findsubset(int arr[],int n , ArrayList<Integer> array) {
        if(n==-1){
            System.out.println(array);
            return;
        }

        array.add(arr[n]);
        // System.out.println("add=> "+arr[n]+" "+array);
        findsubset(arr,n-1, array);
        
        int a = array.remove(array.size()-1);
        // System.out.println("remove=> "+ a +" "+array);
        findsubset(arr,n-1, array);
    }
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        int arr[]={4,5,6,8};
        findsubset(arr,arr.length-1,array);
    }
}
