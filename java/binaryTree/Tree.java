import java.util.Stack;

public class Tree {
    public Node root;

    Tree(){
        this.root = null;
    }

    Tree(int value){
        this.root = new Node(value);
    }

    public Node insertNode(Node root, Node node) {
        if (root == null) {
            this.root = node;
            return root;
        }

        if(node.value < root.value) {
            if (root.leftNode == null) {
                root.leftNode = node;
                return root;
            }
            insertNode(root.leftNode, node);
        }

        if(node.value > root.value) {
            if(root.rightNode == null) {
                root.rightNode = node;
                return root;
            }
            insertNode(root.rightNode, node);
        }

        return root;
    }

    public void inorderTraversal(Node root){
        if(root != null) {
            inorderTraversal(root.leftNode);
            System.out.println(root.value);
            inorderTraversal(root.rightNode);
        }
    }

    public void preOrderTraversal(Node root){
        if (root != null) {
            System.out.println(root.value);
            preOrderTraversal(root.leftNode);
            preOrderTraversal(root.rightNode);
        }
    }

    public void postOrderTraversal(Node root){
        if (root != null) {
            postOrderTraversal(root.leftNode);
            postOrderTraversal(root.rightNode);
            System.out.println(root.value);
        }
    }
}
