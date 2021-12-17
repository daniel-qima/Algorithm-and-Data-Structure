package com.course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student> {

    private Integer age;
    private String name;
    private String hobby;


    @Override
    public int compareTo(Student stu) {
        return this.age - stu.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student stu = (Student) obj;
        return this.age.equals(stu.age) &&
                this.name.equals(stu.name) &&
                this.hobby.equals(stu.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, hobby);
    }
}
