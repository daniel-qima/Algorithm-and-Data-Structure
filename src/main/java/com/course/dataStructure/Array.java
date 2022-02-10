package com.course.dataStructure;

import java.util.Arrays;

public class Array<E> {


    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    // 无参构造函数，默认数组的容量 capacity=10
    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 向所有元素的最后添加一个元素
    public void addLast(E e) {
       add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    // 向指定位置插入元素
    public void add(int index, E e) {
        if (data.length == size)
            throw new IllegalArgumentException("Add last failed, Array is full");

        if (index >= data.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        }

        for (int i = size -1; i>=index; i--) {
            //使用size 因为，size表示元素的个数，data.length是数组的长度，长度存在，但是可能没有元素
//        for(int i= data.length-1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    // 获取 index索引位置的元素
    public E getIndex(int index){
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        }
      return data[index];
    }

    public E getLast() {
        return getIndex(size-1);
    }

    public E getFirst() {
        return getIndex(0);
    }

    // 修改 index位置的元素
    void set(int index, E e) {
        data[index] = e;
    }

    // 查找数组中是否有元素e
    public boolean contains(E e) {
        for(int i=0; i < size; i++) {
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e) {
        for(int i=0; i < size; i++) {
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    // 从数组中删除index位置的元素，返回删除的元素
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds");
        }
        E returnValue = data[index];
        for(int i = index + 1; i < size; i ++) {
            data[i-1] = data[i];// 这里i 不能等于size
        }
        size--;
        data[size] = null; // loitering objects
        return returnValue;
    }





    // 从数组中删除第一个元素，返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    // 从数组中删除最后一个元素，返回删除的元素
    public E removeLast() {
        return remove(size-1);
    }

    // 从数组中删除元素e
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size: %d, capacity= %d \n", size, data.length));
        sb.append(Arrays.toString(data));
        return sb.toString();
    }


    public static void main(String[] args) {
        Array<Integer> array = new Array<Integer>( 20);
        for (int i = 0; i < 10; i++) {
            array.add(i, i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);
    }
}
