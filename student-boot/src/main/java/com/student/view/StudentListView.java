package com.student.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.student.model.Student;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StudentListView {

    protected Student student;

    public StudentListView(Student student) {
        this.student = student;
    }

    public String getName() { return student.getName(); }
    public Long getId() { return Long.valueOf(student.getName()); }

    public String getReleaseYear() {
        return String.valueOf(student.getRoolNo());
    }

}
