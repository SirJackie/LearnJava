package com.example.datastructure;

public class MyArray {
    private String[] data;
    private int size;

    public MyArray(int length) {
        this.data = new String[length];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void expandLength(){
        String[] oldData = this.data;
        this.data = new String[oldData.length * 2];

        for (int i = 0; i < this.size; i++){
            this.data[i] = oldData[i];
        }
    }

    public void push(String item) {
        if (size < data.length){
            data[size] = item;
            size++;
        } else {
            expandLength();
            this.push(item);
        }
    }

    public String get(int index) throws Exception {
        if (index >=0 && index < size) {
            return data[index];
        } else {
            throw new Exception("MyArray is read out of bound!!!");
        }
    }

    public void set(int index, String item) throws Exception {
        if (index >= 0 && index < size) {
            data[index] = item;
        } else {
            throw new Exception("MyArray is written out of bound!!!");
        }
    }

    public void insert(int index, String item) throws Exception {
        if (index < 0 || index > size - 1){
            throw new Exception("MyArray received incontinence insertion.");
        }

        if(size + 1 > data.length){
            this.expandLength();
        }

        for (int i = size; i > index; i--){
            data[i] = data[i-1];
        }

        data[index] = item;
        size++;
    }

    public String delete(int index) throws Exception {
        if (index < 0 || index > size - 1){
            throw new Exception("MyArray received deletion that out of bound.");
        }

        String deletedElement = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;

        return deletedElement;
    }
}
