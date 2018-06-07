package com.udemy.java.pattern.creational.builder.excercise;

public class CodeBuilder {

    private final StringBuilder codeBuilder = new StringBuilder();

    public CodeBuilder(String className) {
        codeBuilder.append(String.format("public class %s", className))
                .append(System.lineSeparator())
                .append("{")
                .append(System.lineSeparator());
    }

    public CodeBuilder addField(String name, String type) {
        codeBuilder.append(String.format("  %s %s %s;", "public", type, name))
                .append(System.lineSeparator());
        return this;
    }


    @Override
    public String toString() {
        return codeBuilder.append("}").toString();
    }
}
