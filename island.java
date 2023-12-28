import java.lang.reflect.Array;
import java.util.Arrays;

class island{
    static boolean v[][]=new boolean [4][5];
    static int n,m;
    public static void main(String[] args) {
        n=4;
        m=5;
        int arr[][]={
            {1,1,0,1,1},
            {1,1,0,0,0},
            {0,0,1,0,0},
            {1,0,0,1,1},
            
        };
        for(boolean row[]:v)
            Arrays.fill(row,false);

        int c=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]==1){
                    c=c+dfs(arr,i,j);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                
                System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }
      
        System.out.println(c);
    }
    public static int dfs(int arr[][],int i,int j){
        if(   
            arr[i][j]==1 &&
            (i-1<0 || arr[i-1][j]==0 ) &&
            (i+1==n || arr[i+1][j]==0) &&
            (j-1<0 || arr[i][j-1]==0) &&
            (j+1==m || arr[i][j+1]==0) 
        ){
            v[i][j]=true;
            return 1;
        }


        // if(
        //     (i-1>-1 && v[i-1][j]==true) ||
        //     (i+1<n && v[i+1][j]==true) ||
        //     (j-1>-1 && v[i][j-1]==true) ||
        //     (j+1<n && v[i][j+1]==true) 
        // ){
        //     return 1;
        // }
        if ( i-1>-1 && arr[i-1][j]==1){
            v[i][j]=true;
            dfs(arr, i-1, j);
        }
        // if  ( i+1<n && arr[i+1][j]==1){

        //         v[i][j]=true;
        //         dfs(arr, i+1, j);
        // }
        // if(j-1>-1 && arr[i][j-1]==1) {
        //         v[i][j]=true;
        //         dfs(arr, i, j-1);
        // }
        // if (j+1<n && arr[i][j+1]==1){
        //         v[i][j]=true;
        //         dfs(arr, i, j+1);
        // }  
        
        

        return 0;
    }
}