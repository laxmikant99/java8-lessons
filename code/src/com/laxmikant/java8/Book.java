package com.laxmikant.java8;

public class Book {

    private String name;
    private String auther;

    public Book(String name, String auther) {
        super();
        this.name = name;
        this.auther = auther;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", auther=" + auther + "]";
    }

}
