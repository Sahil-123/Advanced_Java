package com.xworkz.runner.bikeShowRoom;

import com.xworkz.dto.bikeShowRoomDTO;

import java.util.HashMap;
import java.util.Map;

public class bikeShowRoomRunner {
    public static void main(String[] args) {
        Map<bikeShowRoomDTO,Object> map = new HashMap<>();
        Object dummy = new Object();

        map.put(new bikeShowRoomDTO("aaa","dharwad",12345),dummy);
        map.put(new bikeShowRoomDTO("bbb","pune",24587),dummy);
        map.put(new bikeShowRoomDTO("ccc","solapur",87654),dummy);
        map.put(new bikeShowRoomDTO("ddd","belgavi",56788),dummy);
        map.put(new bikeShowRoomDTO("qqq","belgavi",56788),dummy);
        map.put(new bikeShowRoomDTO("eee","bengalore",34567),dummy);
        map.put(new bikeShowRoomDTO("fff","hukkeri",876598),dummy);

        System.out.println("==== removing entry with city name of hukkeri ====");
        bikeShowRoomDTO bikeShowRoomDTOToRemove = null;
        for (bikeShowRoomDTO bikeShowRoom : map.keySet()){
            if(bikeShowRoom.getCity().equals("hukkeri")){
                bikeShowRoomDTOToRemove = bikeShowRoom;
            }
        }
        map.remove(bikeShowRoomDTOToRemove);

        map.entrySet().forEach((e)-> System.out.println(e.getKey()+" : "+e.getValue()));

        System.out.println("==== find all bike show room with specific city ====");
        map.entrySet().stream().filter(e->e.getKey().getCity().equals("belgavi")).forEach(System.out::println);

        System.out.println("=== Find the bike showroom for the given pincode ====");
        map.entrySet().stream().filter(e->e.getKey().getPinCode().equals(24587)).forEach(System.out::println);

    }
}
