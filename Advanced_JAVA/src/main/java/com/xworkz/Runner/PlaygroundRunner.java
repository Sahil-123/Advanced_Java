package com.xworkz.Runner;

import com.xworkz.DTO.PlaygroundDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlaygroundRunner {
    public static void main(String[] args) {
        List<PlaygroundDTO> playgroundList = new ArrayList<>();
        playgroundList.add(new PlaygroundDTO("ABC Park", "City Center", "Public", 200));
        playgroundList.add(new PlaygroundDTO("XYZ Gardens", "Suburb", "Private", 150));
        playgroundList.add(new PlaygroundDTO("Sunshine Park", "Beachside", "Public", 300));
        playgroundList.add(new PlaygroundDTO("Green Meadows", "Outskirts", "Private", 100));
        playgroundList.add(new PlaygroundDTO("Golden Fields", "Countryside", "Public", 250));


        Collections.sort(playgroundList, (p1,p2)-> p1.getName().compareTo(p2.getName()) );
        System.out.println("Sorted by Name (Ascending):");
        playgroundList.forEach(System.out::println);

        Collections.sort(playgroundList, (p1,p2)-> p2.getName().compareTo(p1.getName()));
        System.out.println("Sorted by Name (Descending):");
        playgroundList.forEach(System.out::println);

        Collections.sort(playgroundList, (p1,p2)-> p1.getLocation().compareTo(p2.getLocation()));
        System.out.println("Sorted by Location (Ascending):");
        playgroundList.forEach(System.out::println);

        Collections.sort(playgroundList, (p1,p2)-> p2.getLocation().compareTo(p1.getLocation()));
        System.out.println("Sorted by Location (Descending):");
        playgroundList.forEach(System.out::println);

        Collections.sort(playgroundList, (p1,p2)-> Integer.compare(p1.getCapacity(),p2.getCapacity()));
        System.out.println("Sorted by capacity (Ascending):");
        playgroundList.forEach(System.out::println);

        Collections.sort(playgroundList, (p1,p2)-> Integer.compare(p2.getCapacity(),p1.getCapacity()));
        System.out.println("Sorted by capacity (Descending):");
        playgroundList.forEach(System.out::println);
    }
}
