package com.example.datastructure;

public class ModuleTest {
    public static void TestMyArray() throws Exception {
        MyArray arr = new MyArray(5);
        arr.push("Alice");
        arr.push("Bob");
        arr.push("Carl");
        arr.push("David");
        arr.push("Edison");
        arr.push("Frank");  // FULL!

        for (int i = 0; i < arr.getSize(); i++){
            System.out.println(arr.get(i));
        }

        arr.set(5, "Fuck");
        System.out.println("-----------------------------");

        for (int i = 0; i < arr.getSize(); i++){
            System.out.println(arr.get(i));
        }

        arr.insert(4, "Epsilon");
        System.out.println("-----------------------------");

        for (int i = 0; i < arr.getSize(); i++){
            System.out.println(arr.get(i));
        }

        arr.delete(5);
        System.out.println("-----------------------------");

        for (int i = 0; i < arr.getSize(); i++){
            System.out.println(arr.get(i));
        }

        System.out.println("-----------------------------");
        System.out.println(arr.getSize());

        //arr.insert(5, "a");  // OK.
        //arr.insert(6, "a");  // Don't do this, use .push() instead.
        //arr.insert(-1, "a");  // Illegal.

        //arr.delete(5);  // OK.
        //arr.delete(6);  // Out of bound.
        //arr.delete(-1);  // Illegal

        for (int i = 0; i < arr.getSize(); i++){
            System.out.println(arr.get(i));
        }

        System.out.println("-----------------------------");
    }

    public static void TestMyLinkedArray() throws Exception {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.push("Alice");
        linkedList.push("Bob");
        linkedList.push("Carl");
        linkedList.push("David");
        linkedList.push("Edison");
        linkedList.push("Frank");
        System.out.println(linkedList.getSize());

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-----------------------------");

        linkedList.set(5, "Fuck");

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-----------------------------");

        linkedList.insert(4, "Epsilon");

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-----------------------------");

        String deletedItem = linkedList.delete(5);
        System.out.println("Deleted Item: " + deletedItem);

        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-----------------------------");

        // Here, my program is very robust, even index=0 insertion can be handled without if statement.
        linkedList.insert(0, "Shit");
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("-----------------------------");
    }

    public static void TestMyArrStack() throws Exception {
        MyArrStack arrStack = new MyArrStack();

        arrStack.push("Alice");
        arrStack.inspect();

        arrStack.push("Bob");
        arrStack.inspect();

        arrStack.push("Carl");
        arrStack.inspect();

        arrStack.push("David");
        arrStack.inspect();

        arrStack.push("Edison");
        arrStack.inspect();

        arrStack.push("Frank");
        arrStack.inspect();

        System.out.print("----------------------------------------------------");
        System.out.print("----------------------------------------------------");
        System.out.print("\n");

        for (int i = 0; i < 6; i++){
            System.out.print("Pop: " + arrStack.pop() + "\t\t");
            arrStack.inspect();
        }
    }

    public static void TestMyArrQueue() throws Exception {
        MyArrQueue arrQueue = new MyArrQueue(5);
        arrQueue.enqueue("Alice");
        arrQueue.enqueue("Bob");
        arrQueue.enqueue("Carl");
        arrQueue.enqueue("David");
        //arrQueue.enqueue("Edison");  // Full. Queue can only store length - 1 items.
        //arrQueue.enqueue("Frank");   // Full. Queue can only store length - 1 items.

        for (int i = 0; i < arrQueue.getSize(); i++){
            System.out.println(arrQueue.get(i));
        }
        System.out.println("-----------------------------");

        arrQueue.dequeue();

        for (int i = 0; i < arrQueue.getSize(); i++){
            System.out.println(arrQueue.get(i));
        }
        System.out.println("-----------------------------");

        arrQueue.dequeue();
        arrQueue.enqueue("Edison");
        arrQueue.enqueue("Frank");

        for (int i = 0; i < arrQueue.getSize(); i++){
            System.out.println(arrQueue.get(i));
        }
        System.out.println("-----------------------------");

        arrQueue.Inspect();
        System.out.println("-----------------------------");

        // Expansion Test
        arrQueue.ExpandLength();
        arrQueue.Inspect();
        System.out.println("-----------------------------");

        // Over-Enqueue Test
        MyArrQueue smallQueue = new MyArrQueue(1);
        smallQueue.enqueue("Alice");
        smallQueue.enqueue("Bob");
        smallQueue.enqueue("Carl");
        smallQueue.enqueue("David");
        smallQueue.enqueue("Edison");
        smallQueue.enqueue("Frank");
        smallQueue.Inspect();
        System.out.println("-----------------------------");
    }
}
