package com.taxibooking.backend.Controller;

import com.taxibooking.backend.Model.Taxi;
import com.taxibooking.backend.Service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaxiController {

    @Autowired
    TaxiService service;

    @RequestMapping("/")
    public String Home(){
        return ("Welcome to Taxi Services \n" +
                "       \"/AllTaxi\" to add Taxi \n"+
                "       \"/GetTaxi/{id}\" to get by index \n"+
                "       \"/addTaxi\" to add new Taxi \n"+
                "       \"/upadteTaxi/{id}\" to update \n"+
                "       \"/deleteTaxi/{id}\" to delete");
    }

    @RequestMapping({"/AllTaxi"})
    public List<Taxi> getTaxi(){
        return service.getTaxi();
    }
    @RequestMapping("/GetTaxi/{id}")
    public Optional<Taxi> getidTaxi(@PathVariable int id){
        return service.getidTaxi(id);
    }
    @PostMapping ("/addTaxi")
    public Taxi addTaxi( @RequestBody Taxi taxi){
        return service.addTaxi(taxi);
    }

    @PutMapping("/updateTaxi/{id}")
    public String updateTaxi(@RequestBody Taxi taxi){
        service.updateTaxi(taxi);
        return  "Taxi is Updated";
    }
    @DeleteMapping("/deleteTaxi/{id}")
    public String deleteTaxi(@PathVariable int id){
        service.deleteTaxi(id);
        return "Succesfully deleted"+id;
    }

}
