package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().filter(number -> number%2 ==1).reduce(0, (x,y) -> y);
    }

    public String getLongest(List<String> words) {
        return null;
    }

    public int getTotalLength(List<String> words) {
        return 0;
    }
}
