//Implementation # - Singly Linked List
//Lindsey Vetvick - CI487

public class SinglyLinkedListTest {

    public static void main(String [] args){

        System.out.println("addToFront tests");
        SinglyLinkedList<Integer> test1 = new SinglyLinkedList<>();
        test1.addToFront(1);
        test1.addToFront(2);
        test1.addToFront(3);
        //test1.addToFront(7);
        //test1.addToFront(1);
        //test1.addToFront(8);
        System.out.println("List 1: " + test1);
        System.out.println("------------------------------------------\n");

        System.out.println("addToEnd tests");
        SinglyLinkedList<Integer> test2 = new SinglyLinkedList<>();
        test2.addToEnd(1);
        test2.addToEnd(2);
        test2.addToEnd(3);
        //test2.addToEnd(6);
        //test2.addToEnd(27);
        //test2.addToEnd(85);
        System.out.println("List 2: " + test2);
        System.out.println("------------------------------------------\n");

        System.out.println("getNodeAtPosition Tests");
        System.out.println("The node containing " + test2.getNodeAtPosition(0).data + " is at position 0 in List 2");
        System.out.println("The node containing " + test2.getNodeAtPosition(1).data + " is at position 1 in List 2");
        System.out.println("The node containing " + test2.getNodeAtPosition(2).data + " is at position 2 in List 2");
        //System.out.println("The node containing " + test2.getNodeAtPosition(4).data + " is at position 4 in List 2");
        //System.out.println("The node containing " + test2.getNodeAtPosition(5).data + " is at position 5 in List 2");
        System.out.println("------------------------------------------\n");

        System.out.println("addNodeAtPosition Tests");
        SinglyLinkedList<Integer> test3 = new SinglyLinkedList<>();
        test3.addNodeAtPosition(0, 2); // testing adding to front
        test3.addNodeAtPosition(0, 1); // testing adding to front
        test3.addNodeAtPosition(test3.size(), 2); // testing adding to end
        test3.addNodeAtPosition(test3.size(), 1); // testing adding to end
        test3.addNodeAtPosition(2, 3); // testing adding to middle
        //test3.addNodeAtPosition(3, 12); // testing adding to middle
        //test3.addNodeAtPosition(4, 8); // testing adding to middle
        System.out.println("List 3: " + test3);
        System.out.println("------------------------------------------\n");


        System.out.println("Remove from front of List 1");
        test1.removeFromFront();
        System.out.println("List 1 after front removal: " + test1 + "\n");

        System.out.println("Remove from end of List 2");
        test2.removeFromEnd();
        System.out.println("List 2 after end removal: " + test2 + "\n");

        System.out.println("Remove position (front, end, middle) from List 3");
        test3.removeNodeAtPosition(2);
        test3.removeNodeAtPosition(0);
        test3.removeNodeAtPosition(test3.size() - 1);
        System.out.println("List 3 after removing middle, front, and end: " + test3);

    }
}
