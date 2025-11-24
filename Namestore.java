import java.util.*;

public class Namestore {
    private ArrayList<String> nameList = new ArrayList<>();
    private TreeSet<String> nameTreeSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
    private HashSet<String> nameHashSet = new HashSet<>();

    public void addName(Scanner scanner) {
        System.out.print("Enter name to add: ");
        String name = scanner.nextLine();

        nameList.add(name);
        nameTreeSet.add(name);
        nameHashSet.add(name);

        System.out.println("Added: " + name);
    }

    public void viewNames() {
        System.out.println("ArrayList (unsorted):");
        for (String name : nameList) {
            System.out.println(name);
        }
    }

    public void compareStructures() {
        System.out.println("\nArrayList size: " + nameList.size());
        System.out.println("TreeSet size: " + nameTreeSet.size());
        System.out.println("HashSet size: " + nameHashSet.size());

        System.out.println("\nTreeSet (sorted):");
        for (String name : nameTreeSet) System.out.println(name);

        System.out.println("\nHashSet (unordered):");
        for (String name : nameHashSet) System.out.println(name);
    }

    public ArrayList<String> getNameList() {
        return nameList;
    }
}

