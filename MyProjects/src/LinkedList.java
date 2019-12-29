import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class LinkedList
{
    static Node myHead=null;
    static Node functionHead=null;

    public static Node removeDuplicates(Node head) {
        //Write your code here
        //check if current elemenyt data nnd next data is same...if same delete duplicate
        if(myHead == null && functionHead == null){
            myHead = head;
            functionHead = head;
        }
        while(functionHead.next != null){
            Node nextNode = functionHead.next;
            String truncatedData = String.valueOf(nextNode.data);
            if(truncatedData.contains("truncated")){
                System.out.println("Coming here....");
                truncatedData = truncatedData.substring(0,truncatedData.indexOf("{"));
                System.out.println("after removing junk ...."+ truncatedData);
                nextNode.data = Integer.valueOf(truncatedData);
            }
            if(functionHead.data == nextNode.data){
                //System.out.println(" Removing node data..."+ nextNode.data);
                functionHead.next = nextNode.next;
                nextNode= null;
                functionHead = functionHead.next;
            }
            else{
                functionHead =functionHead.next;
            }
        }
        //call again the same function recursively to remove duplicates again
        return checkDuplicatesAgain(myHead);

    }

    public static  Node checkDuplicatesAgain(Node head){
        Set<Integer> noDuplicates = new HashSet<Integer> ();
        noDuplicates.add(head.data);


        while(head.next != null){
            noDuplicates.add(head.next.data);
            head = head.next;

        }

        Node newHead = null;
        for(Integer i : noDuplicates){
            newHead = insert(newHead,i);
        }
      return newHead;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();

            while (T-- > 0) {


                try {
                   int  ele = sc.nextInt();
                    head = insert(head, ele);
                }catch(InputMismatchException e){
                   // System.out.println("ignore the xecption");
                    String truncatedData= sc.next();
                    if(truncatedData.contains("truncated")) {
                       // System.out.println("Coming here....");
                        truncatedData = truncatedData.substring(0, truncatedData.indexOf("{"));
                        //System.out.println("after removing junk ...." + truncatedData);
                    }


                    head = insert(head, Integer.valueOf(truncatedData));

                }
            }

        head=removeDuplicates(head);
        display(head);

    }
}
