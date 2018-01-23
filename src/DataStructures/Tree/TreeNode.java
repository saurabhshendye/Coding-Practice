package DataStructures.Tree;

public class TreeNode<E> {
    public E data;
    public TreeNode<E> leftChild = null;
    public TreeNode<E> rightChild = null;

    public TreeNode (E data){
        this.data = data;
    }

}
