package DataStructures.Tree;

public class TreeNode<E> {
    public E data;
    public TreeNode<E> parent;
    public TreeNode<E> leftChild = null;
    public TreeNode<E> rightChild = null;

    public TreeNode (E data, TreeNode<E> par){
        this.data = data;
        this.parent = par;
    }

}
