package org.example.design.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects(List<String> subjects) {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        this.subjects = subs;
        return this;
    }
}
