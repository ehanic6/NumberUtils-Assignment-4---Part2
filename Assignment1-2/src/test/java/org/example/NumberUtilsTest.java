package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;


class NumberUtilsTest {
    /**
     *
     * Step 1: understand the requirement, input type and output type
     *        Requirement: Add two list of integer, index by index, and returns another list
     *
     * Step 2 (raw):  Perform partition and boundary analysis on input and output
     *        Each input: left | right
     *        Combination of input:
     *        Output:
     *  Step 3: Derive potential test cases
     *
     */
    @Test
    @DisplayName("Both lists are null")
    public void testNullInput() {
        //Test case for null input
        //The method should handle null input appropriately and return a null output
        List<Integer> input1 = null;
        List<Integer> input2 = null;
        List<Integer> expectedOutput = null;  //Expected output for null input
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }

    @Test
    @DisplayName("Left input is null")
    void testLeftNullInput() {
        //Test case for left null input
        //The method should handle left null input appropriately and return a null output
        List<Integer> input1 = null;
        List<Integer> input2 = new LinkedList<>(List.of(1, 2)); //LinkedList is used because it is not abstract and is mutable
        List<Integer> expectedOutput = null;  //Expected output for left null input
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }


    @Test
    @DisplayName("Right input is null")
    void testRightNull() {
        //Test case for right null input
        //The method should handle right null input appropriately and return a null output
        List<Integer> input1 = new LinkedList<>(List.of(1, 2));
        List<Integer> input2 = null;
        List<Integer> expectedOutput = null;   //Expected output for right null input
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }
    @Test
    @DisplayName("Both lists are empty")
    void testBothListsAreEmpty() {
        //Test case for inputted empty lists
        //The method should handle empty lists appropriately and return an empty list
        List<Integer> input1 = new LinkedList<>(); //LinkedList used because it is mutable
        List<Integer> input2 = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>(); //Expected output for empty lists
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }

    @Test
    @DisplayName("Left list is empty")
    void testLeftListIsEmpty() {
        //Test case for left empty list
        //The method should handle an empty left list appropriately and return the right list
        List<Integer> input1 = new LinkedList<>(); //LinkedList used because it is mutable
        List<Integer> input2 = new LinkedList<>(List.of(1, 2));
        List<Integer> expectedOutput = new LinkedList<>(List.of(1, 2));  //Expected output for left empty list
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }
    @Test
    @DisplayName("Right list is empty")
    void testRightListIsEmpty() {
        //Test case for right empty list
        //The method should handle an empty right list appropriately and return the left list
        List<Integer> input1 = new LinkedList<>(List.of(1, 2));//LinkedList used because it is mutable
        List<Integer> input2 = new LinkedList<>();
        List<Integer> expectedOutput = new LinkedList<>(List.of(1, 2));  //Expected output for right empty list
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }

    @Test
    @DisplayName("Valid Input")
    void testValidInput() {
        //Test case for valid inputs
        //The method should handle valid inputs appropriately and the sum detailed by the add method
        List<Integer> input1 = new LinkedList<>(List.of(1, 2));//LinkedList used because it is mutable
        List<Integer> input2 = new LinkedList<>(List.of(3, 4));
        List<Integer> expectedOutput = new LinkedList<>(List.of(4, 6));  //Expected output with add method for valid inputs
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }

    @Test
    @DisplayName("Testing carry-over")
    void testCarryOver() {
        //Test case for carry over method
        //The method should handle carry overs appropriately and provide the 0's in the correct spot detailed by the carry over method
        List<Integer> input1 = new LinkedList<>(List.of(9, 9));
        List<Integer> input2 = new LinkedList<>(List.of(0, 1));
        List<Integer> expectedOutput = new LinkedList<>(List.of(1, 0, 0));  //Expected output for carry over method
        assertEquals(expectedOutput, NumberUtils.add(input1, input2));
    }


}

