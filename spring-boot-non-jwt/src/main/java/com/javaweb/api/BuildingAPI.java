package com.javaweb.api;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.dto.BuildingDTO;

@RestController
public class BuildingAPI {
    @GetMapping(value="/api/building")
    public Object getBuilding(@RequestParam(value="name") String name) {
        BuildingDTO building = new BuildingDTO();
        try {}
        catch(Exception e) {}
        building.setName(name);
        return building;
    }
    @PostMapping(value="/api/building")
    public void getBuilding2(@RequestParam Map<String,String> params)
    {
    	System.out.print("oke");
    }
    @DeleteMapping(value="/api/building/{id}")
    public void deleteBuilding(@PathVariable Integer id)
    {
    	System.out.print("đã xóa");
    }
}
