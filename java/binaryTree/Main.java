import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(50);
        
        tree.insertNode(tree.root, new Node(40));
        tree.insertNode(tree.root, new Node(30));
        tree.insertNode(tree.root, new Node(35));
        tree.insertNode(tree.root, new Node(36));
        tree.insertNode(tree.root, new Node(32));
        tree.insertNode(tree.root, new Node(45));
        tree.insertNode(tree.root, new Node(60));
        tree.insertNode(tree.root, new Node(55));
        tree.insertNode(tree.root, new Node(70));

        tree.inorderTraversal(tree.root);
        System.out.println("\n");
        tree.preOrderTraversal(tree.root);
        System.out.println("\n");
        tree.postOrderTraversal(tree.root);

        // System.out.println(tree.root.leftNode.leftNode.value);
        // System.out.println(tree.root.leftNode.value);
        // System.out.println(tree.root.leftNode.rightNode.value);
        // System.out.println(tree.root.value);
        // System.out.println(tree.root.rightNode.leftNode.value);
        // System.out.println(tree.root.rightNode.value);
        // System.out.println(tree.root.rightNode.rightNode.value);
        
    }
}
