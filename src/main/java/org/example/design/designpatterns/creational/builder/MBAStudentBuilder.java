package org.example.design.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        List<String> subs = new ArrayList<>();
        subs.add("Micro economic");
        subs.add("Business studies");
        this.subjects = subs;
        return this;
    }
}
