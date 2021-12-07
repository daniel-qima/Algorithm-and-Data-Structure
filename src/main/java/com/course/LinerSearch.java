package com.course;

import java.util.Objects;

public class LinerSearch {


    public static void main(String[] args) {

        Integer[] data = {2, 3, 5, 50, 26, 80, 75};
        int solution = solution(data, 26);
        System.out.println("index of target is: " + solution);
        System.out.println("index of 666 is: " + solution(data, 666));

        String[] arr = {"a", "b", "c", "d"};
        System.out.println("index of str arr is: " + solution(arr, "b"));

        Student a = new Student(2, "a", "a");
        Student b = new Student(3, "b", "b");
        Student c = new Student(4, "c", "c");
        Student[] stu = {a, b, c};
        System.out.println("obj of stu is " + solution(stu, new Student(3, "b", "b")));
    }


    public static <T> int solution(T[] data, T target) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return result;
    }
}
