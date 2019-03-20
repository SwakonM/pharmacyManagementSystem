package pl.swakon.pharmacy.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.swakon.pharmacy.dao.chemicalsRepo;
import pl.swakon.pharmacy.dao.entity.chemicals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class pharmacyManager {

    private chemicalsRepo chemicalsRepo;

    @Autowired
    public  pharmacyManager(chemicalsRepo chemicalsRepo){
        this.chemicalsRepo =chemicalsRepo;
    }

    public Optional<chemicals> findById (long id){
        return chemicalsRepo.findById(id);
    }
    public Iterable<chemicals> findAll (){
        return chemicalsRepo.findAll();
    }
    public chemicals save (chemicals chemicals){
        return chemicalsRepo.save(chemicals);
    }
    public void  deleteById (long id){
         chemicalsRepo.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new chemicals(1L, "Apap", LocalDate.of(2034, 1, 1)));
        save(new chemicals(2L, "ApapStrong", LocalDate.of(2034, 1, 1)));
    }
}
