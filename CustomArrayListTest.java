public class CustomArrayListTest {
    // Main method to test
    public static void main(String[] args) {
        // create an object of CustomArrayList
        CustomArrayList customList = new CustomArrayList();

        // add elements to the list
        customList.add(20);
        customList.add(21);
        customList.add("Blue");
        customList.add("Purple");
        customList.add("Royal");
        customList.add("data structures");
        customList.add(27);
        customList.add('E');
        customList.add(1);
        customList.add('C');
        customList.add("Happily ever after");
        customList.add(44.98);
        customList.add(47);
        customList.add('H');

        // display the elements of the list
        System.out.println("The elements in the list are: " + customList.display());
        System.out.println();

        // remove some elements from the list at a specified index
        Object removedElements = customList.remove(5);
        System.out.println("The element removed from the list is: " + removedElements);
        System.out.println();
        System.out.println("The elements in the list after the removal are: " + customList.display());
        System.out.println();

        // remove an element by specifying the element itself
        Object elementRemoved2 = customList.removee(21);
        System.out.println("The removed element is: " + elementRemoved2);
        System.out.println("The remaining elements are: " + customList.display());
        System.out.println();

        Object removedElement = customList.removee('H');
        System.out.println("The removed element is: " + removedElement);
        System.out.println();
        System.out.println("The remaining elements are: " + customList.display());
        System.out.println();

        // return an element at aspecified index
        Object element1 = customList.get(3);
        System.out.println("The element at the specified index is: " + element1);
        System.out.println();

        Object element2 = customList.get(2);
        System.out.println("The element at the specified index  is: " + element2);
        System.out.println();

        // check the current size of the array list
        System.out.println("The current size of the arraylist is " + customList.size());
        System.out.println();

        // check whether the array list is empty or not
        System.out.println("The array list is empty: " + customList.isEmpty());
        System.out.println();

        // set an element at a specified index
        customList.set(6, "Admires");
        System.out.println("The updated list after adding another element is: " + customList.display());
        System.out.println();

        // display the final elements in the list
        System.out.println("The final elements in the list are: " + customList.display());

    }

}