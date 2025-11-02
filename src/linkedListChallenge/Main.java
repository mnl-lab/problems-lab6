package linkedListChallenge;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ListIterator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>(Arrays.asList(
                new Place("Adelaide", 1374),
                new Place("Alice Springs", 2771),
                new Place("Brisbane", 917),
                new Place("Darwin", 3972),
                new Place("Melbourne", 877),
                new Place("Perth", 3923),
                new Place("Sydney", 0)
        ));

        places.sort(Comparator.comparingInt(Place::getDistanceFromSydney));
        ListIterator<Place> iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean forward = true;

        System.out.println("""
                (F)orward
                (B)ackward
                (L)ist
                (M)enu
                (Q)uit
                """);

        if (iterator.hasNext()) System.out.println("Starting at: " + iterator.next());

        while (true) {
            System.out.print("Enter: ");
            switch (scanner.nextLine().trim().toUpperCase()) {
                case "F":
                    if (!forward && iterator.hasNext()) iterator.next();
                    forward = true;
                    if (iterator.hasNext())
                        System.out.println("Now visiting: " + iterator.next());
                    else {
                        System.out.println("End of list.");
                        forward = false;
                    }
                    break;

                case "B":
                    if (forward && iterator.hasPrevious()) iterator.previous();
                    forward = false;
                    if (iterator.hasPrevious())
                        System.out.println("Now visiting: " + iterator.previous());
                    else {
                        System.out.println("Start of list.");
                        forward = true;
                    }
                    break;

                case "L":
                    for (Place p : places) System.out.println(p);
                    break;

                case "M":
                    System.out.println("(F)orward (B)ackward (L)ist (M)enu (Q)uit");
                    break;

                case "Q":
                    return;

                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
