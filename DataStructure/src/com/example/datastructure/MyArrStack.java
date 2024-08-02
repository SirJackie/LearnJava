package com.example.datastructure;

public class MyArrStack {
    private MyArray data;

    public MyArrStack() {
        data = new MyArray(5);
    }

    public void push(String item) {
        data.push(item);
    }

    public String pop() throws Exception {
        return data.delete(data.getSize() - 1);
    }

    public void inspect() throws Exception {
        System.out.print("Stack: BOTTOM @@@ ");
        for (int i = 0; i < data.getSize(); i++){
            System.out.print(data.get(i) + " => ");
        }
        System.out.print("\n");
    }
}
