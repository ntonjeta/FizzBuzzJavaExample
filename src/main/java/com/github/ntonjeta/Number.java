package com.github.ntonjeta;

import java.util.Objects;

class Number {
    private final String value;

    Number(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return Objects.equals(value, number.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public Integer get() {
        return Integer.valueOf(value);
    }
}
