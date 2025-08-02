package com.taxibooking.backend.Service;

import com.taxibooking.backend.Model.Taxi;
import com.taxibooking.backend.Reposistory.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxiService {
@Autowired
    public TaxiService(TaxiRepository repo) {
        this.repo = repo;
    }

    public TaxiRepository repo;

    public List<Taxi> getTaxi(){
        return repo.findAll();
    }

    public Taxi addTaxi(Taxi taxi){
      return   repo.save(taxi);
    }
    public void deleteTaxi(int id){
        repo.deleteById(id);
    }


    public Optional<Taxi> getidTaxi(int id) {
       return repo.findById(id);
    }

    public void updateTaxi(Taxi taxi) {
        repo.save(taxi);
    }
}
