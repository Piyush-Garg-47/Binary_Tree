import java.util .*; 
public class L_C_A_A2 {
    static class Node {
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 
    public static Node lca2 (Node root , int n1 , int n2){
      if( root == null || root .data == n1 || root .data==n2){
        return root ; 
      }
      Node leftlca = lca2(root.left , n1, n2); 
      Node rightlca = lca2(root.right, n1, n2) ; 
      if(rightlca ==null){
        return leftlca ; 
      }
       if (leftlca == null ){
        return rightlca ; 
       } 
       return root ; 
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
       System.out.println(lca2(root, n1, n2).data);
    }
}
