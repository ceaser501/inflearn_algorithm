package Reculsive_Tree_Graph.Reculsive_7_5_DFS;

// 이진트리순회(DFS : Depth-First Search
import java.util.*;
class Node{
  int data;
  Node lt, rt;
  public Node(int val){
    data = val;
    lt=rt=null;
  }
}
public class Main {
  Node root;
  public void DFS(Node root){

  }

  public static void main(String args[]){
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.DFS(tree.root);
  }
}
