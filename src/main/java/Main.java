public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.display(); // 20->10
        linkedList.addLast(30);
        linkedList.display(); // 20->10->30
        linkedList.addLast(40);
        linkedList.display(); // 20->10->30->40
        linkedList.add(50, 1);
        linkedList.display(); // 20->50->10->30->40
        linkedList.add(0, 0);
        linkedList.display();
        linkedList.add(70, 6);
        linkedList.display();
    }
}
