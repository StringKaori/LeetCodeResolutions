public class Node {
    public int value;
    public Node leftNode;
    public Node rightNode;

    Node(){
        this.leftNode = null;
        this.rightNode = null;
    }

    Node(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
}