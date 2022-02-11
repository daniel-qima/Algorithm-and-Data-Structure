package com.course.dataStructure.queue;

public interface Queue<E> {

    void enqueue(E e);

    void dequeue();

    E getFront();

    int getSize();

    boolean isEmpty();
}
