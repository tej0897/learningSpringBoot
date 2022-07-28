package com.tej0897.learningSpringBoot.courses;

public class Courses {
    private Integer id;
    private String name;
    private String auther;

    public Courses(Integer id, String name, String auther) {
        this.id = id;
        this.name = name;
        this.auther = auther;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuther() {
        return auther;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
