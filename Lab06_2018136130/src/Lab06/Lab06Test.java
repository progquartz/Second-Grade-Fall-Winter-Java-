package Lab06;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab06Test {
    public static void main(String[] args){
        //testList();
        //testPolynomial();
        //testConcate();
        TestMazeStack();;
        TestMazeQueue();
        testpoly();
        testEmployee();
    }
    public static void testpoly(){
        LinkedList<Term> p2 = new LinkedList<Term>();
        p2.add(new Term(3.0,0));
        p2.add(new Term(2.0,1));
        p2.add(new Term(1.0,2));
        p2.add(new Term(3.5,3));
        System.out.println(p2);

        Iterator<Term> itr = p2.iterator();

        // print coeff

        while(itr.hasNext()){
            Term tm = itr.next();
            System.out.print(tm.getCoeff() + " ");
        }
        System.out.println();

        for(Term tm: p2){
            System.out.print(tm.getCoeff() + " ");
        }
        System.out.println();

    }

    public static void testEmployee(){
        LinkedList<Employee> lst = new LinkedList<Employee>();
        lst.add(new Employee("Name1", "a","asd"));
        lst.add(new Employee("Name2", "b","asdads"));
        lst.add(new Employee("Name3", "c","asdasdasd"));
        System.out.println(lst);
    }
    public static void testList(){
        List<Integer> list1 = new List<Integer>();
        list1.insertAtFront(1);
        list1.insertAtFront(2);
        list1.insertAtFront(3);
        list1.insertAtBack(4);
        list1.insertAtBack(5);
        list1.print();

        System.out.println();

        list1.removeFromBack();
        list1.removeFromFront();
        list1.print();
    }

    public static void testConcate(){
        List<Integer> list1 = new List<Integer>();
        list1.insertAtFront(1);
        list1.insertAtFront(2);
        list1.insertAtFront(3);
        list1.insertAtBack(4);
        list1.insertAtBack(5);
        list1.print();

        List<Integer> list2 = new List<Integer>();
        list2.insertAtFront(51);
        list2.insertAtFront(52);
        list2.insertAtFront(53);
        list2.insertAtBack(54);
        list2.insertAtBack(55);

        List<Integer> list = new List<Integer>();
        list = list.concate(list1,list2);
        list.print();

    }

    public static void testPolynomial(){
        List<Term> list = new List<Term>();
        list.insertAtBack(new Term(3.0, 0));
        list.insertAtBack(new Term(4.0, 1));
        list.insertAtBack(new Term(2.0, 2));
        list.insertAtFront(new Term(2.5,2));
        list.insertAtFront(new Term(3.5,1));
        list.insertAtFront(new Term(4.5,0));
        list.print();

        System.out.println();

        list.removeFromFront();
        list.removeFromBack();
        list.print();
    }

    // depth tracking algorithm
    public static void TestMazeStack(){
        MazeStack a = new MazeStack();
        a.runMaze();

    }

    public static void TestMazeQueue(){
        MazeQueue a = new MazeQueue();
        a.runMaze();;
    }
}

