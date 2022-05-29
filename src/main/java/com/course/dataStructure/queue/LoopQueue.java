package com.course.dataStructure.queue;

import com.course.dataStructure.Array;

public class LoopQueue<E> implements Queue<E>{

    private E[] data;

    private int front, tail;

    // todo if have no size, how to implement the feature
    private int size;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1]; // capacity + 1, 有目的浪费一个空间
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    public int getCapacity() {
        return data.length - 1; // capacity should minus 1
    }

    @Override
    public int getSize() {
        return size;
    }


    /**
     * 入队
     * @param e
     */
    @Override
    public void enqueue(E e) {

        // if queue is full resize
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size ++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
       for (int i=0; i<size; i++) {
           newData[i] = data[(i + front) % data.length ];// data中的元素位置应该是 i+ front 偏移 % data.length
       }

       data = newData;
       front = 0;
       tail = size;
    }

    /**
     * 出队
     */
    @Override
    public E dequeue() {

        if (isEmpty()) {
            throw new IllegalArgumentException(" can't dequeue from an empty queue");
        }

        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;

        if (size == getCapacity() / 4 && 0 != getCapacity() / 2) {
            resize(getCapacity() / 2);
        }
        return ret;
    }



    @Override
    public E getFront() {
        return null;
    }


    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("LoopQueue: size: " + size);
        sb.append(" Front [");
        for (int i = front; i != tail; i = (i + 1) % data.length) {

            sb.append(data[i]);
            if ( (i + 1) % data.length != tail)
                sb.append(",");
        }
        sb.append("] Tail");
        sb.append(" capacity: " + getCapacity());
        return sb.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
