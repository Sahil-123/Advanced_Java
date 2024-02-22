package com.xworkz.Runner;

import com.xworkz.DTO.*;

import java.util.HashMap;
import java.util.Map;

public class EqualityContractExamples {

    public static void employeeDepartment(){
        // Create 10 EmployeeDTO objects
        EmployeeDTO employee1 = new EmployeeDTO("John", 1);
        EmployeeDTO employee2 = new EmployeeDTO("Alice", 2);
        EmployeeDTO employee3 = new EmployeeDTO("Bob", 3);
        EmployeeDTO employee4 = new EmployeeDTO("Charlie", 4);
        EmployeeDTO employee5 = new EmployeeDTO("David", 5);
        EmployeeDTO employee6 = new EmployeeDTO("Eva", 6);
        EmployeeDTO employee7 = new EmployeeDTO("Frank", 7);
        EmployeeDTO employee8 = new EmployeeDTO("Grace", 8);
        EmployeeDTO employee9 = new EmployeeDTO("Henry", 9);
        EmployeeDTO employee10 = new EmployeeDTO("Ivy", 10);

        EmployeeDTO duplicateOfEmployee10 = new EmployeeDTO("Rahul", 10);


        // Create 10 DepartmentDTO objects
        DepartmentDTO department1 = new DepartmentDTO("HR", "Headquarters");
        DepartmentDTO department2 = new DepartmentDTO("IT", "Tech Park");
        DepartmentDTO department3 = new DepartmentDTO("Finance", "Financial District");
        DepartmentDTO department4 = new DepartmentDTO("Marketing", "Downtown");
        DepartmentDTO department5 = new DepartmentDTO("Sales", "Business Center");
        DepartmentDTO department6 = new DepartmentDTO("R&D", "Innovation Campus");
        DepartmentDTO department7 = new DepartmentDTO("Operations", "Warehouse");
        DepartmentDTO department8 = new DepartmentDTO("Legal", "Law Firm");
        DepartmentDTO department9 = new DepartmentDTO("Customer Service", "Call Center");
        DepartmentDTO department10 = new DepartmentDTO("Production", "Factory");

        // Create a map to store the relationship between EmployeeDTO and DepartmentDTO
        Map<EmployeeDTO, DepartmentDTO> employeeDepartmentMap = new HashMap<>();
        employeeDepartmentMap.put(employee1, department1);
        employeeDepartmentMap.put(employee2, department2);
        employeeDepartmentMap.put(employee3, department3);
        employeeDepartmentMap.put(employee4, department4);
        employeeDepartmentMap.put(employee5, department5);
        employeeDepartmentMap.put(employee6, department6);
        employeeDepartmentMap.put(employee7, department7);
        employeeDepartmentMap.put(employee8, department8);
        employeeDepartmentMap.put(employee9, department9);
        employeeDepartmentMap.put(employee10, department10);

        employeeDepartmentMap.put(duplicateOfEmployee10, department1);

        print(employeeDepartmentMap);
    }

    public static void customerOrder(){
        // Create CustomerDTO objects
        CustomerDTO customer1 = new CustomerDTO("C001", "Alice");
        CustomerDTO customer2 = new CustomerDTO("C002", "Bob");
        CustomerDTO customer3 = new CustomerDTO("C003", "Charlie");
        CustomerDTO customer4 = new CustomerDTO("C004", "David");
        CustomerDTO customer5 = new CustomerDTO("C005", "Eva");
        CustomerDTO customer6 = new CustomerDTO("C006", "Frank");
        CustomerDTO customer7 = new CustomerDTO("C007", "Grace");
        CustomerDTO customer8 = new CustomerDTO("C008", "Henry");
        CustomerDTO customer9 = new CustomerDTO("C009", "Ivy");
        CustomerDTO customer10 = new CustomerDTO("C010", "John");

        CustomerDTO duplicateCustomer1 = new CustomerDTO("C001", "Raju");

        // Create OrderDTO objects
        OrderDTO order1 = new OrderDTO("ORD001", 100.00);
        OrderDTO order2 = new OrderDTO("ORD002", 150.00);
        OrderDTO order3 = new OrderDTO("ORD003", 80.00);
        OrderDTO order4 = new OrderDTO("ORD004", 120.00);
        OrderDTO order5 = new OrderDTO("ORD005", 200.00);
        OrderDTO order6 = new OrderDTO("ORD006", 90.00);
        OrderDTO order7 = new OrderDTO("ORD007", 180.00);
        OrderDTO order8 = new OrderDTO("ORD008", 110.00);
        OrderDTO order9 = new OrderDTO("ORD009", 140.00);
        OrderDTO order10 = new OrderDTO("ORD010", 95.00);

        OrderDTO order11 = new OrderDTO("ORD010 Duplycate", 95.00);


        // Create a map to store the relationship between CustomerDTO and OrderDTO
        Map<CustomerDTO, OrderDTO> customerOrderMap = new HashMap<>();
        customerOrderMap.put(customer1, order1);
        customerOrderMap.put(customer2, order2);
        customerOrderMap.put(customer3, order3);
        customerOrderMap.put(customer4, order4);
        customerOrderMap.put(customer5, order5);
        customerOrderMap.put(customer6, order6);
        customerOrderMap.put(customer7, order7);
        customerOrderMap.put(customer8, order8);
        customerOrderMap.put(customer9, order9);
        customerOrderMap.put(customer10, order10);

        customerOrderMap.put(duplicateCustomer1,order11);

        print(customerOrderMap);
    }

    public static void studentSchool(){
        // Create StudentDTO objects
        StudentDTO student1 = new StudentDTO("S001", "Alice", 17);
        StudentDTO student2 = new StudentDTO("S002", "Bob", 16);
        StudentDTO student3 = new StudentDTO("S003", "Charlie", 18);
        StudentDTO student4 = new StudentDTO("S004", "David", 17);
        StudentDTO student5 = new StudentDTO("S005", "Eva", 16);
        StudentDTO student6 = new StudentDTO("S006", "Frank", 18);
        StudentDTO student7 = new StudentDTO("S007", "Grace", 17);
        StudentDTO student8 = new StudentDTO("S008", "Henry", 16);
        StudentDTO student9 = new StudentDTO("S009", "Ivy", 18);
        StudentDTO student10 = new StudentDTO("S010", "John", 17);

        StudentDTO duplicateStudent2 = new StudentDTO("S002", "Rahul", 18);


        // Create SchoolDTO objects
        SchoolDTO school1 = new SchoolDTO("SC001", "ABC School", "Springfield");
        SchoolDTO school2 = new SchoolDTO("SC002", "XYZ School", "Rivertown");
        SchoolDTO school3 = new SchoolDTO("SC003", "PQR School", "Lakeview");
        SchoolDTO school4 = new SchoolDTO("SC004", "LMN School", "Hilltop");
        SchoolDTO school5 = new SchoolDTO("SC005", "DEF School", "Oceanview");

        // Create a map to store the relationship between StudentDTO and SchoolDTO
        Map<StudentDTO, SchoolDTO> studentSchoolMap = new HashMap<>();
        studentSchoolMap.put(student1, school1);
        studentSchoolMap.put(student2, school1);
        studentSchoolMap.put(student3, school2);
        studentSchoolMap.put(student4, school2);
        studentSchoolMap.put(student5, school3);
        studentSchoolMap.put(student6, school3);
        studentSchoolMap.put(student7, school4);
        studentSchoolMap.put(student8, school4);
        studentSchoolMap.put(student9, school5);
        studentSchoolMap.put(student10, school5);

        studentSchoolMap.put(duplicateStudent2,school5);

        print(studentSchoolMap);
    }

    public static void libraryBook(){
        // Create BookDTO objects
        BookDTO book1 = new BookDTO("B001", "To Kill a Mockingbird", "Harper Lee");
        BookDTO book2 = new BookDTO("B002", "1984", "George Orwell");
        BookDTO book3 = new BookDTO("B003", "Pride and Prejudice", "Jane Austen");
        BookDTO book4 = new BookDTO("B004", "The Great Gatsby", "F. Scott Fitzgerald");
        BookDTO book5 = new BookDTO("B005", "Moby-Dick", "Herman Melville");
        BookDTO book6 = new BookDTO("B006", "The Catcher in the Rye", "J.D. Salinger");
        BookDTO book7 = new BookDTO("B007", "To Kill a Mockingbird", "Harper Lee");
        BookDTO book8 = new BookDTO("B008", "1984", "George Orwell");
        BookDTO book9 = new BookDTO("B009", "Pride and Prejudice", "Jane Austen");
        BookDTO book10 = new BookDTO("B010", "The Great Gatsby", "F. Scott Fitzgerald");

        BookDTO duplicateBook3 = new BookDTO("B003", "master Duplicate", "xyz");


        // Create LibraryDTO objects
        LibraryDTO library1 = new LibraryDTO("L001", "Central Library", "Main Street");
        LibraryDTO library2 = new LibraryDTO("L002", "Community Library", "Park Avenue");
        LibraryDTO library3 = new LibraryDTO("L003", "Town Library", "Center Street");
        LibraryDTO library4 = new LibraryDTO("L004", "Public Library", "Broadway");
        LibraryDTO library5 = new LibraryDTO("L005", "City Library", "River Road");

        // Create a map to store the relationship between BookDTO and LibraryDTO
        Map<BookDTO, LibraryDTO> bookLibraryMap = new HashMap<>();
        bookLibraryMap.put(book1, library1);
        bookLibraryMap.put(book2, library1);
        bookLibraryMap.put(book3, library1);
        bookLibraryMap.put(book4, library1);
        bookLibraryMap.put(book5, library2);
        bookLibraryMap.put(book6, library2);
        bookLibraryMap.put(book7, library3);
        bookLibraryMap.put(book8, library3);
        bookLibraryMap.put(book9, library4);
        bookLibraryMap.put(book10, library5);

        bookLibraryMap.put(duplicateBook3,library5);

        print(bookLibraryMap);
    }

    public static void countryCapital(){
        // Create CountryDTO objects
        CountryDTO country1 = new CountryDTO("US", "United States", "North America");
        CountryDTO country2 = new CountryDTO("CA", "Canada", "North America");
        CountryDTO country3 = new CountryDTO("GB", "United Kingdom", "Europe");
        CountryDTO country4 = new CountryDTO("FR", "France", "Europe");
        CountryDTO country5 = new CountryDTO("DE", "Germany", "Europe");
        CountryDTO country6 = new CountryDTO("JP", "Japan", "Asia");
        CountryDTO country7 = new CountryDTO("IN", "India", "Asia");
        CountryDTO country8 = new CountryDTO("CN", "China", "Asia");
        CountryDTO country9 = new CountryDTO("BR", "Brazil", "South America");
        CountryDTO country10 = new CountryDTO("AU", "Australia", "Australia");

        CountryDTO duplicateCountry7 = new CountryDTO("IN", "Indiana", "Asia");

        // Create CapitalDTO objects
        CapitalDTO capital1 = new CapitalDTO("Washington D.C.", "US", 705749);
        CapitalDTO capital2 = new CapitalDTO("Ottawa", "CA", 994837);
        CapitalDTO capital3 = new CapitalDTO("London", "GB", 8787892);
        CapitalDTO capital4 = new CapitalDTO("Paris", "FR", 2148271);
        CapitalDTO capital5 = new CapitalDTO("Berlin", "DE", 3769495);
        CapitalDTO capital6 = new CapitalDTO("Tokyo", "JP", 13929286);
        CapitalDTO capital7 = new CapitalDTO("New Delhi", "IN", 14200467);
        CapitalDTO capital8 = new CapitalDTO("Beijing", "CN", 21542000);
        CapitalDTO capital9 = new CapitalDTO("Brasília", "BR", 3015268);
        CapitalDTO capital10 = new CapitalDTO("Canberra", "AU", 431114);

        CapitalDTO wrongCapital10 = new CapitalDTO("wrong", "AUS", 898763);


        // Create a map to store the relationship between CountryDTO and CapitalDTO
        Map<CountryDTO, CapitalDTO> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put(country1, capital1);
        countryCapitalMap.put(country2, capital2);
        countryCapitalMap.put(country3, capital3);
        countryCapitalMap.put(country4, capital4);
        countryCapitalMap.put(country5, capital5);
        countryCapitalMap.put(country6, capital6);
        countryCapitalMap.put(country7, capital7);
        countryCapitalMap.put(country8, capital8);
        countryCapitalMap.put(country9, capital9);
        countryCapitalMap.put(country10, capital10);

        countryCapitalMap.put(duplicateCountry7,wrongCapital10);

        print(countryCapitalMap);
    }



    public static void print(Map<?,?> map){
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }

    public static void main(String[] args) {
//        employeeDepartment();
//        customerOrder();
//        studentSchool();
//        libraryBook();
//        countryCapital();
    }

}


/*


 */