package com.xworkz.Runner;

import com.xworkz.DTO.MedicineDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineRunner {

    public static void addMedicines(List<MedicineDTO> medicineList){
        medicineList.add(new MedicineDTO("Advil", 1, "Pfizer", LocalDate.now().minusMonths(1), LocalDate.now().plusMonths(6), 56.0,
                List.of("Ibuprofen", "Calcium stearate", "Colloidal silicon dioxide", "Croscarmellose sodium", "Microcrystalline cellulose")));
        medicineList.add(new MedicineDTO("Tylenol", 2, "Johnson & Johnson", LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(1), 75.0,
                List.of("Acetaminophen", "Croscarmellose sodium", "Povidone", "Pregelatinized starch", "Stearic acid")));
        medicineList.add(new MedicineDTO("Zyrtec", 3, "Johnson & Johnson", LocalDate.now().minusMonths(3), LocalDate.now().plusMonths(7), 36.0,
                List.of("Cetirizine hydrochloride", "Colloidal silicon dioxide", "Lactose monohydrate", "Magnesium stearate", "Microcrystalline cellulose")));
        medicineList.add(new MedicineDTO("Claritin", 4, "Bayer", LocalDate.now().minusMonths(3), LocalDate.now().plusMonths(1), 66.0,
                List.of("Loratadine", "Calcium phosphate", "Lactose monohydrate", "Pregelatinized starch")));
        medicineList.add(new MedicineDTO("Aspirin", 5, "Bayer", LocalDate.now().minusDays(15), LocalDate.now().plusMonths(2), 67.0,
                List.of("Acetylsalicylic acid", "Corn starch", "Hypromellose", "Powdered cellulose", "Triacetin")));
        medicineList.add(new MedicineDTO("Lipitor", 6, "Pfizer", LocalDate.now().minusDays(65), LocalDate.now().plusMonths(4), 57.0,
                List.of( "Croscarmellose sodium", "Lactose monohydrate", "Microcrystalline cellulose")));
        medicineList.add(new MedicineDTO("Nexium", 7, "AstraZeneca", LocalDate.now().minusDays(20), LocalDate.now().plusMonths(6), 52.0,
                List.of("Esomeprazole magnesium", "Corn starch", "Crospovidone", "Hyprolose", "Magnesium stearate")));
        medicineList.add(new MedicineDTO("Ventolin", 8, "GlaxoSmithKline", LocalDate.now().minusMonths(6), LocalDate.now().plusMonths(1), 54.0,
                List.of("Albuterol sulfate", "Anhydrous lactose", "Microcrystalline cellulose", "Oleic acid")));
        medicineList.add(new MedicineDTO("Cymbalta", 9, "Eli Lilly", LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(3), 53.0,
                List.of("Duloxetine hydrochloride", "FD&C Blue No. 2", "Gelatin", "Hypromellose", "Titanium dioxide")));
        medicineList.add(new MedicineDTO("Synthroid", 10, "AbbVie", LocalDate.now().minusDays(28), LocalDate.now().plusMonths(2), 59.0,
                List.of("Levothyroxine sodium", "Colloidal silicon dioxide", "Dibasic calcium phosphate dihydrate", "Lactose monohydrate", "Magnesium stearate")));
        medicineList.add(new MedicineDTO("Plavix", 11, "Bristol Myers Squibb", LocalDate.now().minusDays(89), LocalDate.now().plusMonths(3), 41.0,
                List.of("Clopidogrel bisulfate", "Hydrogenated castor oil", "Hypromellose", "Microcrystalline cellulose", "Polyethylene glycol")));
        medicineList.add(new MedicineDTO("Prozac", 12, "Eli Lilly", LocalDate.now().minusDays(76), LocalDate.now().plusMonths(1), 44.0,
                List.of("Fluoxetine hydrochloride", "Colloidal silicon dioxide", "FD&C Blue No. 1", "FD&C Yellow No. 6", "Gelatin")));
        medicineList.add(new MedicineDTO("Celebrex", 13, "Pfizer", LocalDate.now().minusDays(76), LocalDate.now().plusMonths(2), 46.0,
                List.of("Celecoxib", "Calcium phosphate", "Croscarmellose sodium", "Lactose monohydrate", "Magnesium stearate")));
        medicineList.add(new MedicineDTO("Singulair", 14, "Merck", LocalDate.now().minusDays(23), LocalDate.now().plusMonths(3), 47.0,
                List.of("Montelukast sodium", "Croscarmellose sodium", "Hydroxypropyl cellulose", "Lactose monohydrate", "Magnesium stearate")));
        medicineList.add(new MedicineDTO("Zoloft", 15, "Pfizer", LocalDate.now().minusDays(31), LocalDate.now().plusMonths(4), 57.0,
                List.of("Sertraline hydrochloride", "Calcium phosphate", "FD&C Blue No. 2", "Hypromellose", "Magnesium stearate")));
        medicineList.add(new MedicineDTO("Metformin", 16, "Various(generic)", LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(5), 51.0,
                List.of("Metformin hydrochloride", "Hypromellose", "Magnesium stearate", "Polyethylene glycol", "Povidone")));
        medicineList.add(new MedicineDTO("Ritalin", 17, "Novartis", LocalDate.now().minusDays(23), LocalDate.now().plusMonths(6), 71.0,
                List.of("Methylphenidate hydrochloride", "Colloidal silicon dioxide", "Lactose monohydrate", "Pregelatinized starch", "Stearic acid")));
        medicineList.add(new MedicineDTO("OxyContin", 18, "Purdue Pharma", LocalDate.now().minusDays(43), LocalDate.now().plusMonths(7), 74.0,
                List.of("Oxycodone hydrochloride", "Ethylcellulose", "Hydroxypropyl cellulose", "Polyethylene glycol", "Povidone")));
        medicineList.add(new MedicineDTO("Xanax", 19, "Pfizer", LocalDate.now().minusDays(78), LocalDate.now().plusMonths(8), 25.0,
                List.of("Alprazolam", "Lactose monohydrate")));
        medicineList.add(new MedicineDTO("Benadryl", 20, "Johnson & Johnson", LocalDate.now().minusMonths(2), LocalDate.now().plusMonths(9), 21.0,
                List.of("Diphenhydramine hydrochloride", "Crospovidone", "FD&C Blue No. 1", "Magnesium stearate")));

    }
    public static void main(String[] args) {

        List<MedicineDTO> medicineList = new ArrayList<>();
        addMedicines(medicineList);

        System.out.println("======printing medicine by default sorting the company name=====");
//        medicineList.stream().sorted().forEach(System.out::println);

        System.out.println();
        System.out.println("=======Expiry date by descending=======");
//        medicineList.stream().sorted((e1,e2)->e2.getExpiryDate().compareTo(e1.getExpiryDate())).forEach(System.out::println);

        System.out.println();
        System.out.println("=======Sorting By Cost in Ascending order========");
//        medicineList.stream().sorted((e1,e2)->e1.getCost().compareTo(e2.getCost())).forEach(System.out::println);

        System.out.println();
        System.out.println("=======Listing the Medicines where the ingredients size should be > 4");
//        medicineList.stream().filter(e->e.getIngredients().size() > 4)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        System.out.println();
        System.out.println("======= Collect All ingredients of medicines=======");
//        medicineList.stream().map(e->e.getIngredients()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();
        System.out.println("======= Collect all comapany sort by desc and print in Uppercase=====");
//        medicineList.stream()
//                .map(e->e.getCompany())
//                .sorted((e1,e2)->e2.compareTo(e1))
//                .forEach(e-> System.out.println(e.toUpperCase()));

        System.out.println();
        System.out.println("======= Collect only name in lowercase in desc order ==========");
//        medicineList.stream()
//                .map(e->e.getName().toLowerCase())
//                .sorted((e1,e2)->e2.compareTo(e1))
//                .forEach(System.out::println);

        System.out.println();
        System.out.println("======= Collect all elements where manufacture date is < 30 days");
//        medicineList.stream()
//                .filter(e->{
//                    long days = LocalDate.now().toEpochDay() - e.getManfDate().toEpochDay();
//                    return days < 30;
//                })
//                .forEach(System.out::println);

//        System.out.println(LocalDate.now().toEpochDay() - medicineList.get(0).getManfDate().toEpochDay());


        System.out.println();
        System.out.println("======= Collect all elements where manufacture date is > 30 days");
//        medicineList.stream()
//                .filter(e->{
//                    long days = LocalDate.now().toEpochDay() - e.getManfDate().toEpochDay();
//                    return days > 30;
//                })
//                .forEach(System.out::println);


        System.out.println();
        System.out.println("======= Collect all elements where expiry date is < 30 days");
//        medicineList.stream()
//                .filter(e->{
//                    long days = e.getExpiryDate().toEpochDay() - LocalDate.now().toEpochDay();
//                    return days < 30;
//                })
//                .forEach(System.out::println);

    }
}



