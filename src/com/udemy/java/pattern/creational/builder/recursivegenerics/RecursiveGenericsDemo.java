package com.udemy.java.pattern.creational.builder.recursivegenerics;


// builder inheritance with recursive generics
class RecursiveGenericsDemo {
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Dmitri")
                .worksAs("Quantitative Analyst");
        System.out.println(eb.build());
    }
}


