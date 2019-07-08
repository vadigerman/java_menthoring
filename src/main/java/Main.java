public class Main {
    public static void main(String[] args) {
        Node node = new Node("A", new Node("B", new Node("C", new Node("D", new Node("E", null)))));
        Node result = Node.reverse(node);
        Node.toPrint(result);

        NodeTree tree = new NodeTree("A",
                new NodeTree("B",
                        new NodeTree("D", null, null),
                        new NodeTree("E", null, new NodeTree("F", null, null))),
                new NodeTree("C", null, null));
        System.out.println(tree.name);
        NodeTree.bfs(tree);
    }
}
