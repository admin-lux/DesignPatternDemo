package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public class Client {

    public static void main(String[] args) {
        List<Employee> employees = new List<Employee>();
        Employee[] employees1 = new Employee[]{
                new Employee("a"),
                new Employee("b"),
                new Employee("c"),
                new Employee("d"),
                new Employee("e")
        };
        employees.add(employees1);
        //外置迭代器实现
        ListIterator listIterator = new ListIterator(employees);
        ReverseListIterator reverseListIterator = new ReverseListIterator(employees);
        printEmployees(listIterator);
        listIterator = null;

        System.out.println("-----------------");
        printEmployees(reverseListIterator);
        reverseListIterator = null;

        //外置迭代器，工厂方法实现
        Iterator iterator = employees.createIterator();
        System.out.println("-----------------");
        printEmployees(iterator);
        iterator = null;


        System.out.println("-----------------");
        //内置迭代器实现
        PrintNEmployees printNEmployees = new PrintNEmployees(employees, 2);
        printNEmployees.traverser();

    }


    public static void printEmployees(Iterator<Employee> iterator) {
        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            System.out.println(iterator.currentItem().toString());
        }
    }

}
