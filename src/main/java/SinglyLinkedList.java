public class SinglyLinkedList {
    private Node head; // lưu lại node đầu tiên của linkedlist
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    // Thêm phần tử vào đầu danh sách?
    public void addFirst(int x){
        // Bước 1: tạo node mới
        Node tmp = new Node(x);
        // Bước 2: node mới -> next head hiện tại
        tmp.setNext(head);
        // Bước 3: Gán head hiện tại bằng tmp
        head = tmp;
        // tang size
        size ++;
    }
    public void addLast(int x){
        if(isEmpty()){
            addFirst(x);
            return;
        }
        // Buoc 2: tim ra phan tu cuoi ??
        Node k = head;
        for(int i = 0 ; i < size -1; i++){
            k = k.getNext();
        }
        // Da co phan tu cuoi
        Node tmp = new Node(x);
        k.setNext(tmp);
        // Tang size
        size ++;
    }

    public void add(int x, int position){
        if(position == 0){
            addFirst(x);
        } else if (position == size) {
            addLast(x);
        } else if (position < 0 || position > size) {
            throw new RuntimeException("Vị trí không hợp lệ!");
        }
        else{
            // position > 0 và < size
            // Tìm position - 1 => position
            Node k = head;
            for(int i = 0; i < position -1; i++){
                k = k.getNext();
            }
            Node positionNode = k.getNext();
            // Node moi
            Node tmp = new Node(x);
            k.setNext(tmp);
            tmp.setNext(positionNode);
            size++;

        }
    }

    public void display(){
        // Duyet tu head => phan tu cuoi (co getNext = null)
        if(isEmpty()){
            System.out.println("Linkedlist is empty!");
            return;
        }
        Node k = head;
        while (k != null){
            System.out.print(k+"-->");
            k = k.getNext();
        }
        System.out.print("NULL\n");
    }


}
