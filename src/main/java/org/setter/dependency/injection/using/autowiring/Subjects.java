package org.setter.dependency.injection.using.autowiring;
import  java.util.List;

public class Subjects {

    private List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }


    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjects=" + subjects +
                '}';
    }
}
