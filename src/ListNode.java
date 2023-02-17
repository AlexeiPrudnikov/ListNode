public class ListNode {
    Node head;

    public void reverse() {
        if (head != null && head.next != null) {
            reverse(head, head.next);
        }
    }
    private void reverse(Node previousNode, Node currentNode){

        if (currentNode.next != null){
            reverse(currentNode, currentNode.next);
        }
        else{
            head = currentNode;
        }

        currentNode.next = previousNode;
        previousNode.next =null;
    }

    public ListNode(Node head) {
        this.head = head;
    }
    public ListNode(){

    }
}
