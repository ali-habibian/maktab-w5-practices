package intarray;

public class Main {
    public static void main(String[] args) {
        // With default constructor
        IntArray array1 = new IntArray();

        // With constructor that have parameter with capacity that user want
        IntArray array2 = new IntArray(3);

        testCase(array1);

        testCase(array2);

    }

    private static void testCase(IntArray array) {
        System.out.println("***********************************************");
        System.out.println("Size: " + array.size() + " Capacity: " + array.capacity());

        array.add(10);
        array.add(12);
        array.add(19);
        array.add(32);
        array.add(25);
        array.add(19);

        System.out.print("Original Array = > ");
        array.print();

        System.out.print("After adding 6 element => ");
        System.out.println("Size: " + array.size() + " Capacity: " + array.capacity());
        array.print();

        System.out.print("Asc Sorting = > ");
        IntArray ascSortedArray = new IntArray();
        ascSortedArray = array.sortAsc();
        ascSortedArray.print();

        System.out.println("Binary search for 32 in ASC sorted array = > " +
                ascSortedArray.binarySearch(32));

        System.out.print("Desc Sorting = > ");
        IntArray descSortedArray = new IntArray();
        descSortedArray = array.sortDesc();
        descSortedArray.print();

        System.out.print("Original Array = > ");
        array.print();

        System.out.println("search for 32 in original array = > " +
                array.search(32));

        System.out.println("Element at index 3: " + array.get(3));

        array.removeWithValue(19);
        System.out.print("remove element with value 19 => ");
        array.print();

        array.remove(3);
        System.out.print("remove element in index 3 => ");
        array.print();

        System.out.print("Array contain 25? => ");
        if (array.contains(25))
            System.out.println("Yes");
        else
            System.out.println("No");

        array.trim();
        System.out.print("After trim => ");
        System.out.println("Size: " + array.size() + " Capacity: " + array.capacity());
    }
}
