package com.udemy.java.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

class BetterFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
