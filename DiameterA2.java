
import java.util.*;
public class DiameterA2{
    static class Node {
        int data;
        Node left ,right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
}
public static int height(Node root ){
    if(root==null ){
        return 0 ;
    }
     int lh = height(root.left);
     int rh = height(root.right);
       return  Math.max(lh,rh) + 1 ;
}
static class Info{
    int ht ;
    int diam; 
     public Info( int ht , int diam ){
         this .ht =ht ;
         this.diam = diam ; 
     } 
}
public static Info diameter(Node root ){
    if (root == null ){
         return new Info(0 , 0 ); 
    }
     Info infoleft = diameter(root.left);
     Info inforight = diameter(root.right); 
     int diam = Math.max(Math.max( infoleft.diam , inforight.diam ) , infoleft.ht + inforight.ht +1 ) ; 
     int ht = Math.max(infoleft.ht , inforight.ht+1) ; 
     return new Info(diam , ht ); 
}
public static void main(String[] args) {
    Node root = new Node(1);
    root .left = new Node(2);
    root.right = new Node(3);
    root.left.left= new  Node(4);
    root.left.right =new Node(5);
    root.right.left =new Node(6);
    root.right.right = new Node(3);
    System.out.println(height(root));
    System.out.println(diameter(root).diam);
}
}
