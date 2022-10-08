import ra.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------TEST----------------");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(21);
        myLinkedList.addFirst(23);
        myLinkedList.add(4,5);
        myLinkedList.add(5,12);
        myLinkedList.printList();
    }
}