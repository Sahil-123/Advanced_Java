package com.xworkz.Runner;

import com.xworkz.DTO.DiseaseDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {
        List<DiseaseDTO> diseaseList = new ArrayList<>();
        diseaseList.add(new DiseaseDTO("Common Cold", "Runny or stuffy nose, Sore throat, Cough", "Rest, Hydration, Over-the-counter cold medications", 1));
        diseaseList.add(new DiseaseDTO("Influenza", "Fever, Chills, Body aches, Fatigue", "Antiviral medications, Rest, Hydration", 2));
        diseaseList.add(new DiseaseDTO("Migraine", "Severe headache, Nausea, Sensitivity to light and sound", "Pain relievers, Rest in a quiet, dark room", 1));
        diseaseList.add(new DiseaseDTO("Asthma", "Shortness of breath, Wheezing, Chest tightness, Coughing", "Inhaled corticosteroids, Bronchodilators", 4));
        diseaseList.add(new DiseaseDTO("Diabetes", "Increased thirst, Frequent urination, Fatigue, Blurred vision", "Insulin therapy, Oral medications, Diet and exercise", 52));

        Collections.sort(diseaseList,(p1,p2)-> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted list with name in Ascending order...");
        diseaseList.forEach(System.out::println);

        Collections.sort(diseaseList,(p1,p2)-> p2.getName().compareTo(p1.getName()));
        System.out.println("Sorted list with name in Descending order...");
        diseaseList.forEach(System.out::println);


        Collections.sort(diseaseList,(p1,p2)-> p1.getSymptoms().compareTo(p2.getSymptoms()));
        System.out.println("Sorted list with symptoms in Ascending order...");
        diseaseList.forEach(System.out::println);


        Collections.sort(diseaseList,(p1,p2)-> p1.getSymptoms().compareTo(p2.getSymptoms()));
        System.out.println("Sorted list with symptoms in Ascending order...");
        diseaseList.forEach(System.out::println);


        Collections.sort(diseaseList,(p1,p2)-> Integer.compare(p1.getDuration(),p2.getDuration()));
        System.out.println("Sorted list with duration in Ascending order...");
        diseaseList.forEach(System.out::println);


        Collections.sort(diseaseList,(p1,p2)-> Integer.compare(p2.getDuration(),p1.getDuration()));
        System.out.println("Sorted list with duration in Descending order...");
        diseaseList.forEach(System.out::println);
    }
}
