package com.course.dataStructure.stack;

import com.course.dataStructure.Array;

public class ArrayStack<E> implements Stack<E>{

    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);

    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }


    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: [");
        for (int i = 0; i < array.getSize(); i++) {
            sb.append(array.getIndex(i));
            if (i != array.getSize() - 1) {
                sb.append(",");
            }
        }

        sb.append("] top");
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrarStack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            arrarStack.push(i);
            System.out.println(arrarStack);
        }
        arrarStack.pop();
        System.out.println(arrarStack);
    }
}
