package com.taxibooking.backend.Reposistory;

import com.taxibooking.backend.Model.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends JpaRepository<Taxi,Integer> {
}
