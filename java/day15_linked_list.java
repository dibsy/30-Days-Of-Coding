  public static  Node insert(Node head,int data) {
        //Complete this method
        Node n=new Node(data);
        if(head==null){
            head=new Node(data);
        }
        else{
            Node d=head;
            while(head.next!=null)
                head=head.next;
            head.next=n;
            head = d;
        }
        return head;
    }
