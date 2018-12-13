package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionTestSuite {
    ArrayList<Integer> numbers;
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator empty = new OddNumbersExterminator();
        numbers.clear();
        if(numbers.isEmpty()) System.out.println("The list is empty");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator odd = new OddNumbersExterminator();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);

        odd.exterminate(numbers);
    }
}

