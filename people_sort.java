import java.util.*;

public class person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> people = new HashMap<>();

        boolean run = true;
        while (run) {
            System.out.print("\nEnter a name: ");
            String name = scanner.nextLine().trim();
            name = name.substring(0, 1).toUpperCase() + name.substring(1);

            System.out.print("\nEnter an age: ");
            int age = Integer.parseInt(scanner.nextLine());

            people.put(name, age);

            System.out.print("\nEnter more? (y/n): ");
            String moreNames = scanner.nextLine().toLowerCase();
            
            if (moreNames.equals("n")) {
                run = false;
            } else if (!moreNames.equals("y")) {
                System.out.println("\nThat is not an option.");
            }
        }
        scanner.close();

        System.out.println("Original list: " + people);

        List<String> names = new ArrayList<>(people.keySet());
        List<Integer> ages = new ArrayList<>(people.values());

        // Sort by names
        Collections.sort(names);
        
        System.out.println("\nSorted by names:");
        for (String name : names) {
            System.out.println(name + ": " + people.get(name));
        }

        // Sort by ages
        Collections.sort(ages, Collections.reverseOrder());

        System.out.println("\nSorted by ages:");
        for (int age : ages) {
            for (String name : people.keySet()) {
                if (people.get(name) == age) {
                    System.out.println(name + ": " + age);
                    break;
                }
            }
        }
    }
}
