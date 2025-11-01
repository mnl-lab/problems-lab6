package arrayListChallenge.src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> groceryList = new ArrayList<>();

        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do:");

        int choice = scan.nextInt();
        scan.nextLine(); // consume the newline after nextInt()

        boolean flag = true;
        while (flag) {
            switch (choice) {
                case 0: {
                    flag = false;
                    System.out.println("Shutting down...");
                    break;
                }
                case 1: {
                    System.out.println("Enter an item or comma-delimited list of items to add:");
                    String input = scan.nextLine();
                    String[] items = input.split(",");

                    for (String item : items) {
                        // Trim whitespace and convert to lowercase for consistent comparison
                        String trimmedItem = item.trim();
                        if (!trimmedItem.isEmpty()) {
                            if (!groceryList.contains(trimmedItem)) {
                                groceryList.add(trimmedItem);
                            } else {
                                System.out.println("'" + trimmedItem + "' is already in the list.");
                            }
                        }
                    }

                    System.out.println("The list:");
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                    break;
                }
                case 2: {
                    System.out.println("Enter an item or comma-delimited list of items to remove:");
                    String input = scan.nextLine();
                    String[] items = input.split(",");

                    for (String item : items) {
                        String trimmedItem = item.trim();
                        if (!trimmedItem.isEmpty()) {
                            if (groceryList.remove(trimmedItem)) {
                                System.out.println("'" + trimmedItem + "' removed from the list.");
                            } else {
                                System.out.println("'" + trimmedItem + "' not found in the list.");
                            }
                        }
                    }

                    System.out.println("The list:");
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                    break;
                }
            }

            if (flag) { // Only show menu again if not shutting down
                System.out.println("\nAvailable actions:");
                System.out.println("0 - to shutdown");
                System.out.println("1 - to add item(s) to list (comma delimited list)");
                System.out.println("2 - to remove any items (comma delimited list)");
                System.out.println("Enter a number for which action you want to do:");
                choice = scan.nextInt();
                scan.nextLine(); // consume the newline after nextInt()
            }
        }

        scan.close();
    }
}