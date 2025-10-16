package muthusir;

import muthusir.exceptionhandler.StudentNotFound;

public class DoublyLinkedList {
   private Node head;
   private Node tail;

   public void insertStudent(Student student){
       Node newNode = new Node(student);
       if(head == null){
           head = tail = newNode;
           return;
       }
       tail.next = newNode;
       newNode.prev = tail;
       tail = newNode;
   }
   public void searchStudent(int studentId){
       Node temp = head;
       while(temp != null){
           if(temp.data.getStudentId() == studentId){
               System.out.println("Student found: "+temp.data);
               return;
           }
           temp = temp.next;
       }
       throw new StudentNotFound("No Student list is found");
   }
   public void deleteStudent(int studentId){
       if(head == null){
           throw new StudentNotFound("No student is found");
       }
       Node temp = head;
       while (temp != null && temp.data.getStudentId() != studentId){
           temp = temp.next;
       }
       if(temp == null){
           throw new StudentNotFound("No student is found");
       }
       if(temp.prev != null){
           temp.prev.next = temp.next;
       }else {
          tail = temp.next;
       }
       if(temp.next != null){
           temp.next.prev = temp.prev;
       }else {
           tail = temp.prev;
       }
       System.out.println("Student with Id "+studentId+"is DeletedSuccessfully");
   }
   public void displayForward(){
       if(head == null){
           throw new StudentNotFound("No Student List is Found");
       }
       System.out.println("Displaying Student Details (Head->Tail)");
       Node temp = head;
       if(temp != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
   }
   public void displayBackward(){
       if(tail == null){
           throw new StudentNotFound("No Student list is Found");
       }
       System.out.println("Displaying Student Details (Tail -> Head)");
       Node temp = tail;
       if(temp !=null){
           System.out.println(tail.data);
           temp = temp.prev;
       }
   }
   public void sortStudentByPercentage(){
       if(head == null || head.next == null){
           System.out.println("List is small to sort");
           return;
       }
       boolean swap;
       do{
           swap = false;
           Node current = head;
           while (current.next != null){
               if(current.data.getStudentPercentage() > current.next.data.getStudentPercentage()){
                   Student temp = current.data;
                   current.data = current.next.data;
                   current.next.data = temp;
                   swap = true;
               }
               current = current.next;
           }
       }while (swap);
       System.out.println("Records sorted based on percentage successfully");
   }
}
