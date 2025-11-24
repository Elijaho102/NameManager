import java.util.*;

public class Sorter {
    public void sortNames(Scanner scanner, ArrayList<String> names) {
        System.out.println("Choose Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Java Built-in Sort");
        int choice = scanner.nextInt();

        ArrayList<String> copy = new ArrayList<>(names);
        long start = System.nanoTime();

        switch (choice) {
            case 1:
                bubbleSort(copy);
                System.out.println("Bubble Sort (O(n²)) used.");
                break;
            case 2:
                insertionSort(copy);
                System.out.println("Insertion Sort (O(n²)) used.");
                break;
            case 3:
                Collections.sort(copy, String.CASE_INSENSITIVE_ORDER);
                System.out.println("Java Timsort (O(n log n)) used.");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " ns");
        System.out.println("Sorted Names:");
        for (String name : copy) System.out.println(name);
    }

    public void bubbleSort(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    public void insertionSort(ArrayList<String> list) {
        for (int i = 1; i <list.size(); i++) {
            String key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareToIgnoreCase(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}

