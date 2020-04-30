package com.example.myapplication;

public class Subjects {
    private String SubjectName;
    private String SubjectCode;
    private String description;

    private Subjects(String subjectName,String subjectCode,String description){
        this.SubjectName=subjectName;
        this.SubjectCode=subjectCode;
        this.description=description;
    }
    public static final Subjects[] firstYearSubject = {
            new Subjects("Statics","MECH1301","An Introduction to Engineering Mechanics"),
            new Subjects("Engineering Mathematics 1","MATH1314","An Introduction to Engineering Mathematics")
    };
    public static final Subjects[] secondYearSubject = {
            new Subjects("Dynamics","MECH1302","An extension of Engineering Mechanics with the inclusion of F=ma"),
            new Subjects("Engineering Mathematics 1","MATH1315","Calculus 2")
    };

    public String getDescription() {
        return description;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public String getSubjectCode() {
        return SubjectCode;
    }
    public String toString() {
        return this.SubjectName;
    }
}
