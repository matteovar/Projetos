package Arvore_Binaria;

public class BinaryTree{
    private Node root;


    public BinaryTree(Node root){
        this.root = null;
    }

    public Node getroot(){
        return root;
    }

    public void setroot(Node root){
        this.root = root;
    }
     
    public boolean isEmpty(){
        return root == null;
    }
}
