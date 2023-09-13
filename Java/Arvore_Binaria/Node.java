package Arvore_Binaria;

public class Node {
    private String data;
    private Node parent;
    private Node left;
    private Node right;

    public Node(){
        this("",null);
    }

    public Node(String data){
        this(data,null);
    }

    public Node(String data, Node parent){
        this.data = data;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public String getdata(){
        return data;
    }

    public void setdata(String data){
        this.data = data;
    }

    public Node getparent(){
        return parent;
    }

    public void setparent(Node parent){
        this.parent = parent;
    }

    public Node getleft(){
        return left;
    }

    public void setleft(Node left){
        this.left = left;
    }

    public Node getright(){
        return right;
    }

    public void setright(Node right){
        this.right = right;
    }

    @Override
    public String toString(){
        return "Data: " + data 
               + ", Parent: " + (parent != null ? parent.getdata() : "null") 
               + ", Esquerda: " + (left != null ? left.getdata() : "null" )
               + ", Direita: " + (right != null ? right.getdata() : "null" );
    }

   


}