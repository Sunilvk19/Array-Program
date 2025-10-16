package muthusir;

import muthusir.exceptionhandler.InvalidNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(choice != 7){
            System.out.println("\n=======StudentManagementDoublyLinkedList==============");
            System.out.println("1.AddStudent");
            System.out.println("2.DeleteStudent");
            System.out.println("3.SearchStudent");
            System.out.println("4.DisplayAllStudent(Head->Tail)");
            System.out.println("5.DisplayAllStudent(Tail->Head)");
            System.out.println("6.SortStudentDetails");
            System.out.println("7.Exit");
            try {
                System.out.println("Enter Your Choice: ");
                choice = scan.nextInt();
            }catch (InputMismatchException ie){
                System.out.println("Enter Valid Number ");
                scan.nextLine();
                continue;
            }
            switch (choice){
                case 1:
                    try {
                        System.out.println("Enter Student id: ");
                        int Id = scan.nextInt();
                        System.out.println("Enter Student name: ");
                        String name = scan.next();
                        System.out.println("Enter Student Age: ");
                        int age = scan.nextInt();
                        System.out.println("Enter Student Percentage: ");
                        float percentage = scan.nextFloat();

                        linkedList.insertStudent(new Student(Id, name, age, percentage));
                        System.out.println("Student Details are Successfully Added");
                    }catch (Exception e){
                        System.out.println("Enter Valid Details ");
                    }
                    break;
                case 2:
                    System.out.println("Enter StudentId: ");
                    int id = scan.nextInt();
                    linkedList.deleteStudent(id);
                    System.out.println("Deleted Student Details");
                    break;
                case 3:
                    System.out.println("Enter StudentId: ");
                    id = scan.nextInt();
                    linkedList.searchStudent(id);
                    System.out.println("These are Student Details.");
                    break;
                case 4:
                    linkedList.displayForward();
                    break;
                case 5:
                    linkedList.displayBackward();
                    break;
                case 6:
                    System.out.println("These Are Sorted Student Details");
                    linkedList.sortStudentByPercentage();
                    break;
                case 7:
                    System.out.println("Thank You.");
                    break;
                default:
                    throw new InvalidNumberException("Enter Valid Number");
            }
        }
    }
}
