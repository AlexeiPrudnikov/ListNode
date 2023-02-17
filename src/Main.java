public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(new Node(1, new Node(2, new Node(3, new Node(4, new Node(5))))));
        listNode.reverse();
        System.out.println("");
    }
}