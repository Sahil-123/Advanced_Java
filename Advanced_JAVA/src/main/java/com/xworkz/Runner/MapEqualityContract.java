package com.xworkz.Runner;

import com.xworkz.DTO.AddressDTO;
import com.xworkz.DTO.PersonDTO;

import java.util.HashMap;
import java.util.Map;

public class MapEqualityContract {
    public static void main(String[] args) {
        PersonDTO person1 = new PersonDTO("John", "john@example.com");
        PersonDTO person2 = new PersonDTO("Alice", "alice@example.com");
        PersonDTO person3 = new PersonDTO("Bob", "bob@example.com");
        PersonDTO person4 = new PersonDTO("Carol", "carol@example.com");
        PersonDTO person5 = new PersonDTO("David", "david@example.com");

        AddressDTO address1 = new AddressDTO(101, "12345", "Main St");
        AddressDTO address2 = new AddressDTO(202, "54321", "Oak St");
        AddressDTO address3 = new AddressDTO(303, "67890", "Elm St");
        AddressDTO address4 = new AddressDTO(404, "98765", "Maple St");
        AddressDTO address5 = new AddressDTO(505, "13579", "Pine St");

        Map<PersonDTO, AddressDTO> personAddressMap = new HashMap<>();

        personAddressMap.put(person1, address1);
        personAddressMap.put(person2, address2);
        personAddressMap.put(person3, address3);
        personAddressMap.put(person4, address4);
        personAddressMap.put(person5, address5);


//        Adding Duplicated with person with different name but same email.
        PersonDTO person6 = new PersonDTO("xyz", "john@example.com");
        AddressDTO address6 = new AddressDTO(8000, "13579", "BTM St");

        System.out.println("person 6 is present : "+personAddressMap.containsKey(person6));
        personAddressMap.put(person6,address6);

        for (Map.Entry<PersonDTO, AddressDTO> entry : personAddressMap.entrySet()) {
            System.out.println(entry.getKey() + " === "+ entry.getValue());
        }
    }
}
