import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Iterator;

// public static void main(String[] args){

//     // create a custom ArrayList that mimics the behaviour of the standard non-generic ArrayList of java
//     ArrayList<Object> myAssortedList = new ArrayList<>();
//     myAssortedList.add("Blue");
// }
//from above, we cannot use this since we are supposed to create a custom arraylist and not one that will use stuff from the in built one

// create a custom ArrayList that mimics the behaviour of the standard non-generic ArrayList of java
public class CustomArrayList {
    // creating a private member variable to keep track of the current size of the
    // list.
    private static final int LIST_CAPACITY = 8;

    // create an internal array to store the elements
    private Object[] customArrayElements;

    // shows the current number of elements in the list
    private int arraySize;

    // default constructor with the default list capacity specified above
    public CustomArrayList() {
        this(LIST_CAPACITY);
    }

    // overloaded constructor with specified intitial size or capacity
    public CustomArrayList(int initialSize) {
        if (initialSize <= 0) {
            /**
             * throw an exception when the initial size of the arraylist is zero or
             ** negative.This is when a method receives an illegal or inappropriate argument,
             ** in this case a negative number or zero.
             **/
            throw new IllegalArgumentException("The initial size of the array list should be greater than zero!");
        }
        this.customArrayElements = new Object[initialSize];
        // initialize the size of the array to zero and increment later as elements are
        // added to the list
        this.arraySize = 0;
    }

    // method to automatically resize the internal array whenever it becomes full
    // upon adding elements
    public void resizeCapacity(int minimumCapacity) {
        // check if the needed capacity or size to add on new elements is greater than
        // the current or available size
        if (minimumCapacity > customArrayElements.length) {
            // increase the size or capacity of the array by tripling it
            int newCapacity = customArrayElements.length * 3;
            // create a new array with a larger capacity and a copy of the elements in the
            // old array in addition to the newly added elements
            customArrayElements = Arrays.copyOf(customArrayElements, newCapacity);
        }
    }

    // method to add elements to the end of the list
    public void add(Object element) {
        // check to see if there is enough space to accommodate the addition of an
        // element
        resizeCapacity(arraySize + 1);
        // add the element at the end of the array list
        customArrayElements[arraySize] = element;
        // increase the size of the array based on the addition made
        arraySize++;
    }

    // method to remove the element at the specified index and return it
    public Object remove(int index) {
        // first check if the given index is valid and throw an exception if the index
        // is out of bounds
        if (index >= arraySize || index < 0) {
            throw new IndexOutOfBoundsException("The given index is invalid!");
        }
        // if the index is valid, continue to remove the element
        // initialize and declare a variable of the type object that removes stores the
        // removed element
        Object removedElements = customArrayElements[index];
        // resize or realign the array to fill the space created by the removed element.

        for (int i = index; i < arraySize - 1; i++) {
            customArrayElements[i] = customArrayElements[i + 1];
        }
        // decrease the size of the list after removal
        arraySize--;
        // resizing to null to show the removal
        customArrayElements[arraySize] = null;
        // return the removed element
        return removedElements;
    }

    // remove by element
    public Object removee(Object element) {
        // loop through the elements in the list
        for (int i = 0; i < arraySize; i++) {
            // check to see if the element specified to be removed is eual to the element in
            // the list at a particular time when looping through the list
            // equals was used because we want to check if the elements themselves are equal
            // and not their references, not primitive type
            if (customArrayElements[i].equals(element)) {
                // remove and store the removed element like in the previous remove method
                Object removedElement = customArrayElements[i];

                // realign the elements to fill the space of the removed element
                for (int k = i; k < arraySize - 1; k++) {
                    customArrayElements[k] = customArrayElements[k + 1];
                }
                // decrement the siz
                arraySize--;
                customArrayElements[arraySize] = null;

                return removedElement;
            }
        }
        // if they are not equal, display a message to the user
        return "The specified element was not found in the list. Try again!";
    }

    // method to return the element at the specified index
    public Object get(int index) {
        // check for the validity of the specified index making sure it is not out of
        // bounds(empty or greater than or equal to the size of the array)
        if (index >= arraySize || index < 0) {
            throw new IndexOutOfBoundsException("The given index is out of bounds!");
        }
        // retuen the element at the specified index
        return customArrayElements[index];
    }

    // method to return the current size of the list or the number of elements
    public int size() {
        return arraySize;
    }

    // method to return true or false depending on whether the list is empty
    public boolean isEmpty() {
        return arraySize == 0;
    }

    // method to display the contents of the list in the format: [element, element,
    // element,...., element]
    public String display() {
        // use Stringbuilder class to build a string of the displayed elements in the
        // square braces
        // initialize and declare the stringbuilder class
        StringBuilder stringDisplay = new StringBuilder("[");
        // loop through the elements in the list and append them to the stringbuilder
        for (int j = 0; j < arraySize; j++) {
            stringDisplay.append(customArrayElements[j]); // append the current element based on the index as the
                                                          // looping occurs

            // append a comma and whitespace after each element so far as it is not the last
            // element
            if (j < arraySize - 1) {
                stringDisplay.append(", ");
            }
        }
        // append or add the closing bracket to the stringbuilder after the elements
        // have been appended
        stringDisplay.append("]");

        // change the stringbuilder to String(based on the data type of the display
        // method) and return it
        return stringDisplay.toString();
    }

    // set method
    public void set(int index, Object element) {
        // check the validity of the specified index
        if (index >= arraySize || index < 0) {
            throw new IndexOutOfBoundsException("The given index is out of bounds!");
        }
        // set the preferred element at the specified index
        customArrayElements[index] = element;
    }
}
