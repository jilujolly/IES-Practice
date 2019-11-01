package myimple;

public class MyLinkedList {
    Node head;

 //Insert at end position.
    public void Insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

         if(head==null){
             head=node;
         }else{
                 Node n=head;
                 while(n.next!=null){
                     n=n.next;
                 }
                 n.next=node;
             }
         }
//Insert at start position.
    public void InsertatStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next=head;
        head = node;
    }

    public void show(){
           Node node=head;
           while(node.next!=null){
               System.out.println(node.data);
              node= node.next;
           }
           System.out.println(node.data);
         }
    public void Deleteat(int data,int index) {
        Node n=head;
        Node n1=null;
        if(index==0){
            head=head.next;
        }else{
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;

        }

    }

    //Insert at any position.
         public void Insertat(int data,int index) {
             Node node = new Node();
             node.data = data;
             node.next = null;
             Node n = head;
             if (index == 0) {
                 InsertatStart(data);
             } else {

                 for (int i = 0; i < index - 1; i++) {
                     n = n.next;
                 }
                 node.next = n.next;
                 n.next = node;
             }
         }


}



