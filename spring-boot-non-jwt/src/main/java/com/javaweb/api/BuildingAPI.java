package com.javaweb.api;

import org.springframework.web.bind.annotation.*;

import com.javaweb.dto.BuildingDTO;
import com.javaweb.dto.ErrorDTO;

import java.util.Map;

@RestController
public class BuildingAPI {

    @PostMapping(value = "/api/building")
    public Object getBuilding(@RequestBody BuildingDTO building) {
        System.out.print(15/0);
        return null;

    }

//    @PostMapping(value = "/api/building")
//    public void getBuilding2(@RequestParam Map<String, String> params) {
//        System.out.print("oke");
//    }

    @DeleteMapping(value = "/api/building/{id}")
    public void deleteBuilding(@PathVariable Integer id) {
        System.out.print("đã xóa");
    }
}
