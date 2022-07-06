package LinkedList;

public class SinglyLinkedList {

    private Node head; // 첫 번째 노드 저장

    // 첫번째 노드로 삽입
    public void addFirstNode(String data){
        Node newNode = new Node(data, head);
        head = newNode;
    }

    // 마지막 노드로 삽입
    public Node getLastNode(){
        for(Node currNode=head;currNode != null; currNode=currNode.link){
            if(currNode.link==null){
                return currNode;
            }
        }
        return null;
    }

    public Node getLastNode2(){
        Node tmp = head;
        while (tmp.link!=null){
            tmp = tmp.link;
        }
        return tmp;
    }

    public void addLastNode(String data){
        if(head == null){//공백리스트
            addFirstNode(data);
            return;
        }
        Node lastNode = getLastNode();
        Node newNode = new Node(data);

        lastNode.link = newNode;
    }

    public void insertAfterNode(Node preNode, String data){

        if(preNode == null) {
            System.out.println("선행노드가 없어 삽입이 불가합니다.");
            return;
        }
        Node newNode = new Node(data, preNode.link);
        preNode.link = newNode;
    }


    public Node getNode(String data){
        for(Node currNode=head;currNode != null; currNode=currNode.link){
            if(currNode.data.equals(data)){
                return currNode;
            }
        }
        return null;
    }

    public Node getPreviousNode(Node target){
        for(Node currNode=head;currNode != null; currNode=currNode.link){
            if(currNode.link == target){
                return currNode;
            }
        }
        return null;
    }

    public void deleteNode(String data){
        Node targetNode = getNode(data);
        if(targetNode == null){
            System.out.println("삭제할 노드 없음");
            return;
        }
        Node preNode = getPreviousNode(targetNode);
        if(preNode==null){
            head = targetNode.link;
        }else{
            preNode.link= targetNode.link;
        }
        targetNode.link = null; // 지역변수 null 될 뿐 원래 값은 다음노드 링크
    }

    public void printList(){
        System.out.print("L = ( ");
        for(Node currNode=head;currNode != null; currNode=currNode.link){
            System.out.print(currNode.data+" ");
        }
        System.out.println(") ");
    }

}
