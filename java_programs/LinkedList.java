import java.util.*;

class LinkedList{

  static class Node{
    int value;
    Node next;

    public Node(){
      //value=n;
    }
  }

  static Node head= null;

  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    boolean flag =true ;
    while(flag){
    System.out.println("Enter 1 to insert at beginning, 2 to insert at certain position, 3 to remove, 4 to remove at certain position, 5 to exit: ");
    int choice= sc.nextInt();

    switch(choice){
      case 1: System.out.println("Enter number: ");
              int num= sc.nextInt();
              insert(num);
              break;
      case 2: System.out.println("Enter number and position to insert after: ");
              num= sc.nextInt();
              int pos= sc.nextInt();
              insert(num, pos);
              break;
      case 3: remove();
              break;
      case 4: System.out.println("Enter position: ");
              pos= sc.nextInt();
              remove(pos);
              break;
      case 5: flag=false;
              break;
      default:flag=false;
              System.out.println("Wrong input");
              break;
    }
  }
    //insert(2, 3);
    //remove();
  }

  public static void insert(int num){
    //for inserting an element from the beginning, when list is empty
    Node n= new Node();
    n.value= num;
    head= n;
    head.next= null;
  }

  public static void insert(int num, int pos){
    //insert element AFTER the position specified by user
    Node n= new Node();
    n.value= num;

    if(head==null){
      //insertion at beginning
      head= n;
      head.next= null;
      //System.out.println(head.value);
    }else{
      //insertion after node #pos
      int count=1;
      //traversing
      Node pointer= head;
      try{
        while(count<pos){
          System.out.println(pointer.value);
          pointer= pointer.next;
          ++count;
      }
        n.next= pointer.next;
        pointer.next= n;
      }catch(Exception e){
      System.out.println("Error: "+e+ "\nThis position does not exist in the List. Try Again.");
    }
    }
  }

  public static void remove(){
    //removing the node from the last
    Node p= head;
    //Node q= p.next;
    if(head==null){
      System.out.println("empty list");
    }
    else if(head.next==null){
      //only one node
      System.out.println("removed: "+head.value);
      head=null;
    }
    else{
    while(p.next.next!=null){
      p= p.next;
    }
    Node q= p.next;
    System.out.println("removed: "+q.value);
    p.next= null;
  }
}

  public static void remove(int pos){
    //remove node after position pos specified by the user.
    if(head==null){
      System.out.println("empty list");
    }
    else{
    Node p= head;
    Node q= p.next;
    int count= 1;
    try{
      while(count<pos){
        p=p.next;
        q=q.next;
        ++count;
      }
      System.out.println("removed: "+q.value);
      p.next= q.next;
    }catch(Exception e){
      System.out.println("Error: "+e+ "\nThis position does not exist in the List. Try Again.");
    }
  }
 }
}
