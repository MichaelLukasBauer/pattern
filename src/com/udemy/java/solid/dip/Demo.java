package com.udemy.java.solid.dip;


// A. High-level modules should not depend on low-level modules.
// Both should depend on abstractions.

// B. Abstractions should not depend on details.
// Details should depend on abstractions.

class Demo {
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        // low-level module
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}
