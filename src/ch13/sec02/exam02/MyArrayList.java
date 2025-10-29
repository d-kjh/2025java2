package ch13.sec02.exam02;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] arr;

    public MyArrayList() {
        this.arr = (T[])new Object[0];
    }

    public int size() {
        return arr.length;
    }

    public void add(T item) {
        int size = size();
        T[] newArr = (T[])new Object[size + 1];
        newArr[size] = item;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;
    }

    public T get(int index) {
        return arr[index];
    }

    public void add(int index, T item) {
        int size = size();
        T[] newArr = (T[])new Object[size + 1];
        newArr[index] = item;
        for (int i = 0; i < size; i++) {
            newArr[i < index ? i : i + 1] = arr[i];
        }
        this.arr = newArr;
    }

    public T pop() {
        int size = size() - 1;
        T pop = arr[size];
        T[] newArr = (T[])new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;
        return pop;
    }
// 오버라이딩
    @Override
    public String toString() {
//        return Arrays.toString(arr);
        StringBuilder sb = new StringBuilder("[");
        if (size() > 0) {
            sb.append(arr[0]);
            for (int i = 1; i < size(); i++) {
                sb.append(", ").append(arr[i]);
            }
        }
        return sb.append("]").toString();
    }
}
