package pl.swakon.pharmacy.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.swakon.pharmacy.dao.entity.chemicals;
import pl.swakon.pharmacy.manager.pharmacyManager;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/app/chemicals")
public class chemicalsApp {
    private pharmacyManager chemicals;
    @Autowired
public chemicalsApp (pharmacyManager chemicals){
        this.chemicals = chemicals;
    }

    @GetMapping("/status")
    public String getStatus() {

        return "App working";
    }


    @GetMapping("/all")
    public Iterable<chemicals> getAll() {
        return chemicals.findAll();
    }

    @GetMapping
    public Optional<pl.swakon.pharmacy.dao.entity.chemicals> getById(@RequestParam long index) {
        return chemicals.findById(index);
    }

    @PostMapping
    public pl.swakon.pharmacy.dao.entity.chemicals addChemicals(@RequestBody chemicals chemicals1) {
        return chemicals.save(chemicals1);
    }
    @PutMapping
    public chemicals upgradeChemicals(@RequestBody chemicals chemicals1) {
        return chemicals.save(chemicals1);
    }

    @DeleteMapping // usuwa element
    public void deleteChemicals(@RequestParam long index) {
        chemicals.deleteById(index);
    }
}

