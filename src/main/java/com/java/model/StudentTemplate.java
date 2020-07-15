package com.java.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTemplate {
    private static Map<String, Object> map = new HashMap<>();
    String message="successful";

    public static Object getData() {
        map.put("msg","putting data into db");
        map.put("one", new Student("hari", 1));
        List<Student> students = new ArrayList<>();
        students.add(new Student("giri", 2));
        students.add(new Student("akshu", 3));
        students.add(new Student("adya", 4));
        map.put("studentList", students);
        return map;
    }
}
