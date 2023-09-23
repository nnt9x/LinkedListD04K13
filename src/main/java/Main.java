public class Main {
    public static void main(String[] args) {
        Node node1, node2, node3;
        node1 = new Node(1);
        node2 = new Node(2);
        node3 = new Node(3);

        node1.setNext(node2);
        node2.setNext(node3);

        System.out.println();
    }
}
