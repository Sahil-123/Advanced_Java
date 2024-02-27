package com.xworkz.Runner;

import com.xworkz.DTO.AddressDTO;
import com.xworkz.DTO.PersonDTO;

import java.util.HashMap;
import java.util.Map;

public class MapRunner1 {
    public static void main(String[] args) {
        Map<String, Integer> countryPopulationMap = new HashMap<>();

        // Adding country names and populations to the map
        countryPopulationMap.put("China", 1439323776);
        countryPopulationMap.put("India", 1380004385);
        countryPopulationMap.put("United States", 331002651);
        countryPopulationMap.put("Indonesia", 273523615);
        countryPopulationMap.put("Pakistan", 220892340);

        System.out.println("Is India exists : "+countryPopulationMap.containsKey("India"));
        System.out.println("Is 1380004385 value exists :"+countryPopulationMap.containsValue(1380004385));

        System.out.println(countryPopulationMap.equals(Map.entry("China",1439323776)));
        System.out.println("Getting India value : "+countryPopulationMap.get("India"));
        System.out.println("HashCode : "+countryPopulationMap.hashCode());
        System.out.println("isEmpty : "+countryPopulationMap.isEmpty());
        countryPopulationMap.keySet().forEach(e-> System.out.print(e+","));
        System.out.println();
        countryPopulationMap.values().forEach(e-> System.out.print(e+","));
        System.out.println();
        countryPopulationMap.put("xyz",1234555663);
        System.out.println("=========");
        countryPopulationMap.entrySet().forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
        System.out.println();
        System.out.println("=========");
        countryPopulationMap.remove("xyz");
        countryPopulationMap.entrySet().forEach(e-> System.out.print(e.getKey()+" : "+e.getValue()));
        System.out.println("Size : "+countryPopulationMap.size());

        Map<String, Integer> dummy = new HashMap<>();
        dummy.put("qqq",123456789);

        countryPopulationMap.putAll(dummy);
        System.out.println("===========");
        countryPopulationMap.forEach((k,v)-> System.out.println(k+" : "+v));

        System.out.println("-------------------------------------------");
        System.out.println();

        Map<PersonDTO, AddressDTO> personAddressMap = new HashMap<>();

        // Creating PersonDTO and AddressDTO objects
        PersonDTO person1 = new PersonDTO("John", "john@example.com");
        AddressDTO address1 = new AddressDTO(101, "560001", "Main Street");

        PersonDTO person2 = new PersonDTO("Alice", "alice@example.com");
        AddressDTO address2 = new AddressDTO(202, "560002", "Park Avenue");

        PersonDTO person3 = new PersonDTO("Bob", "bob@example.com");
        AddressDTO address3 = new AddressDTO(303, "560003", "Broadway");

        PersonDTO person4 = new PersonDTO("Emily", "emily@example.com");
        AddressDTO address4 = new AddressDTO(404, "560004", "Oak Street");



        // Adding elements to the map
        personAddressMap.put(person1, address1);
        personAddressMap.put(person2, address2);
        personAddressMap.put(person3, address3);
        personAddressMap.put(person4, address4);

        System.out.println("Contains peron with email id: alice@example.com = "+personAddressMap.containsKey(new PersonDTO("alice1", "alice@example.com")));
        System.out.println("contains value "+personAddressMap.containsValue(new AddressDTO(303, "560003", "Broadway")));

        System.out.println("HashCode : "+personAddressMap.hashCode());
        System.out.println("isEmpty : "+personAddressMap.isEmpty());
        System.out.println("Size : "+personAddressMap.size());

        personAddressMap.keySet().forEach(System.out::println);
        System.out.println();
        personAddressMap.values().forEach(System.out::println);
        System.out.println();

        System.out.println("=============");

        personAddressMap.entrySet().forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));
        System.out.println("=============");


        PersonDTO personToRemove = new PersonDTO("Alice", "alice@example.com");
        personAddressMap.remove(personToRemove);
        personAddressMap.forEach((k,v)-> System.out.println(k+" : "+v));

        System.out.println("===================");
        Map<PersonDTO, AddressDTO> personAddressMapDummy = new HashMap<>();
        PersonDTO person5 = new PersonDTO("David", "david@example.com");
        AddressDTO address5 = new AddressDTO(505, "560005", "Elm Street");
        personAddressMapDummy.put(person5, address5);

        personAddressMap.putAll(personAddressMapDummy);
        personAddressMap.forEach((k,v)-> System.out.println(k+" : "+v));

    }
}
