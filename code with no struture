import java.util.*;
// Main class for managing names, sorting, and searching
public class NameManager {
    private static ArrayList<String> nameList = new ArrayList<>();
    private static TreeSet<String> nameTreeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    private static HashSet<String> nameHashSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n---Name Management System---");
            System.out.println("1. Add Name");
            System.out.println("2. View Names (ArrayList)");
            System.out.println("3. Sort Names (choose algorithm)");
            System.out.println("4. Search for the Name");
            System.out.println("5. Compare Data Structures");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addName(scanner);
                    break;
                case 2:
                    viewNames();
                    break;
                case 3:
                    sortNames(scanner);
                    break;
                case 4:
                    searchName(scanner);
                    break;
                case 5:
                    compareDataStructures(scanner);
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Add Name 
    private static void addName(Scanner scanner) {
        System.out.print("Enter name to add: ");
        String name = scanner.nextLine();

        nameList.add(name);
        nameTreeSet.add(name);
        nameHashSet.add(name);

        System.out.println("Added: " + name);
    }
    // View names in ArrayList 
    private static void viewNames(){
        System.out.println("nArrayList (unsorted): ");
        for (String name : nameList) {
            System.out.println(name);
        }
    }
    // Sort names using chosen algorithm 
    private static void sortNames(Scanner scanner) {
        System.out.println("\nChoose Sorting Algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Insertion Sort");
        System.out.println("3. Java Built-in Sort (Timsort)");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        ArrayList<String> templist = new ArrayList<>(nameList);
        long start = System.nanoTime();

        switch (choice) {
            case 1:
                bubbleSort(templist);
                System.out.println("Sorted using Bubble Sort:");
                break;
            case 2:
                insertionSort(templist);
                System.out.println("Sorted using Insertion Sort:");
                break;
            case 3:
                Collections.sort(templist, String.CASE_INSENSITIVE_ORDER);
                System.out.println("Sorted using Java Built-in Sort:");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + " ns");
        System.out.println("\nSorted Names:");
        for (String name : templist) {
            System.out.println(name);
        }
    }

    //Bubble Sort implementation
    private static void bubbleSort(ArrayList<String> list) {
        int n = list.size();
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }
    //Insertion Sort implementation
    private static void insertionSort(ArrayList<String> list) {
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
    // Search for a name data structures
    private static void searchName(Scanner scanner) {
        System.out.print("Enter name to seacrh: ");
        String target = scanner.nextLine();

        // Linear Search 
        Long startLinear = System.nanoTime();
        boolean foundLinear = linearSearch(nameList, target);
        long endLinear = System.nanoTime();

        // Binary Search (on sorted list)
        ArrayList<String> sortedList = new ArrayList<>(nameList); 
        Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER);
        Long startBinary = System.nanoTime();
        boolean foundBinary = (Collections.binarySearch(sortedList, target, String.CASE_INSENSITIVE_ORDER) >= 0);
        long endBinary = System.nanoTime();

        System.out.println("\nLinear Search: " + (foundLinear ? "Found" : "Not Found") + 
        " | Time: " + (endLinear - startLinear) + "ns");
        System.out.println("Binary Search: " + (foundBinary ? "Found" : "Not Found") + 
        " | Time: " + (endBinary - startBinary) + "ns");
    }
    // Linear Search implementation
    private static boolean linearSearch(ArrayList<String> list, String target) {
        for (String name : list) {
            if (name.equalsIgnoreCase(target)) return true;
        }
        return false;
    }

    // Compare data structures for search performance
    private static void compareDataStructures(Scanner scanner) {
        System.out.println("\nData Structure Comparison:");
        System.out.println("ArrayList size: " + nameList.size());
        System.out.println("TreeSet size: " + nameTreeSet.size());
        System.out.println("HashSet size: " + nameHashSet.size());

        System.out.println("\nTreeSet (sorted): ");
        for (String name : nameTreeSet) {
            System.out.println(name);
        }

        System.out.println("\nHashSet (unsorted): ");
        for (String name : nameHashSet) {
            System.out.println(name);
        }
    }
}


