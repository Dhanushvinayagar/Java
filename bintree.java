import java.util.LinkedList;
import java.util.Queue;

class bintree{
    static int i=-1;
    static Node tree(int arr[]){
        i++;
        if(arr[i]==-1){
            return null ;
        }
        Node root = new Node(arr[i]);
        root.left = tree(arr);
        root.right = tree(arr);
        // System.out.println(root.data);
        return root;
    }
    static void inorderTraverse(Node root){
        if(root == null){
            return;
        }
        inorderTraverse(root.left); 
        System.out.println(root.data);
        inorderTraverse(root.right);
    }
    public static int nodeCount(Node root){
        if(root==null){
            return 0;
        }
        int left = nodeCount(root.left);
        int right = nodeCount(root.right);
        return left + right +1;
    }

    public static int nodeSum(Node root){
        if(root==null){
            return 0;
        }  

        int left = nodeSum(root.left);
        int right = nodeSum(root.right);
  
        return left + right + root.data;
    }

    public static int treeHeight(Node root){
        if(root==null){
            return 0;
        }
        int left = nodeCount(root.left);
        int right = nodeCount(root.right);
        return Math.max(left, right);
    }

    static void levelorderTraverse(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            
            if(currentNode == null){
                System.out.println("");
                if(queue.isEmpty()){
                    break;
                }else{
                    queue.add(null);
                }
            }else{
                if(currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
                System.out.print(currentNode.data + " ");
            }
            
        }

    }
    public static void leftView(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        leftView(root.left);
    }
    public static void rightView(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        rightView(root.right);
    }

    public static void main(String[] args) {
        int arr [] ={1,2,4,7,-1,-1,-1,5,-1,-1,3,6,-1,-1,-1};
        Node root = tree(arr);

        System.out.println("Inorder travere:");
        inorderTraverse(root);

        System.out.println("Node count :");
        System.out.println(nodeCount(root));

        System.out.println("Node Sum :");
        System.out.println(nodeSum(root));

        System.out.println("Tree height :");
        System.out.println(treeHeight(root));

        System.out.println("Level order traverse:");
        levelorderTraverse(root);

        System.out.println("Left view");
        leftView(root);

        System.out.println("Right view");
        rightView(root);

//                                1
//                       2                 3
//                  4         5        6        -1
//              7    -1   -1   -1  -1  -1
//          -1    -1

        // Node root = new Node(7);
        // System.out.println(root.data + " " + root.left +" " + root.right);
        // Node rootleft = new Node(8);
        // root.left = rootleft;
        // Node rootright = new Node(9);
        // root.right = rootright;        
        // System.out.println(root.data + " " + root.left.data +" " + root.right.data);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null ;
        this.right =null;
    }
}