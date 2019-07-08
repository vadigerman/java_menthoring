public class Node {
    String name;
    Node nextNode;

    public Node(String name, Node nextNode) {
        this.name = name;
        this.nextNode = nextNode;
    }

    public static Node reverse(Node node) {
        Node previous = node;
        Node current = node.nextNode;
        previous.nextNode = null;
        while (current != null) {
            Node next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void toPrint(Node node) {
        System.out.println(node.name);
        if (node.nextNode != null) {
            toPrint(node.nextNode);
        }
    }
}
