package com.javaweb.api;

import org.springframework.web.bind.annotation.*;

import com.javaweb.dto.BuildingDTO;
import com.javaweb.dto.ErrorDTO;

import java.util.Map;

@RestController
public class BuildingAPI {

    @GetMapping(value = "/api/building")
    public Object getBuilding(@RequestParam(value = "name", required = false) String name) {
        BuildingDTO building = new BuildingDTO();
        try {
            System.out.println(12 / 0);  // Intentional error for testing
        } catch (Exception e) {
            ErrorDTO error = new ErrorDTO();
            error.setError(e.getMessage());
            return error;
        }
        building.setName(name);
        return building;
    }

    @PostMapping(value = "/api/building")
    public void getBuilding2(@RequestParam Map<String, String> params) {
        System.out.print("oke");
    }

    @DeleteMapping(value = "/api/building/{id}")
    public void deleteBuilding(@PathVariable Integer id) {
        System.out.print("đã xóa");
    }
}
