public class NodeTree {
    String name;
    NodeTree leftNode;
    NodeTree rightNode;

    public NodeTree(String name, NodeTree leftNode, NodeTree rightNode) {
        this.name = name;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public static void bfs(NodeTree node) {
        System.out.println(node.leftNode != null ? node.leftNode.name : "null");
        System.out.print(node.rightNode != null ? node.rightNode.name : "null");
        if (node.leftNode != null) {
            bfs(node.leftNode);
        }
        if (node.rightNode != null) {
            bfs(node.rightNode);
        }
    }
}
