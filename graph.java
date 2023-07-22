
public class graph {

    static boolean graphmatrix[][]=new boolean[4][4];
    public static void setEdge(int a ,int b) {
        graphmatrix[a][b]=true;
    }

    public static void printAdjacancy() {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(graphmatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                graphmatrix[i][j]=false;
            }
        }
        setEdge(0, 1);
        setEdge(1, 2);
        setEdge(2, 2);
        setEdge(3, 1);
        printAdjacancy();
    }
}
