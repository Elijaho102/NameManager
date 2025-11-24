import java.util.*;

public class Searcher {
    public void search(Scanner scanner, ArrayList<String> list) {
        System.out.print("Enter name to search: ");
        String target = scanner.nextLine();

        long startLinear = System.nanoTime();
        boolean foundLinear = linearSearch(list, target);
        long endLinear = System.nanoTime();

        ArrayList<String> sorted = new ArrayList<>(list);
        Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        long startBinary = System.nanoTime();
        boolean foundBinary = Collections.binarySearch(sorted, target, String.CASE_INSENSITIVE_ORDER) >= 0;
        long endBinary = System.nanoTime();

        System.out.println("Linear Search: " + (foundLinear ? "Found" : "Not Found") +
                " | Time: " + (endLinear - startLinear) + " ns");
        System.out.println("Binary Search: " + (foundBinary ? "Found" : "Not Found") +
                " | Time: " + (endBinary - startBinary) + " ns");
    }

    private boolean linearSearch(List<String> list, String target) {
        for (String name : list) {
            if (name.equalsIgnoreCase(target)) return true;
        }
        return false;
    }
}

