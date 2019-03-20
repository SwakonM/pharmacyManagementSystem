package pl.swakon.pharmacy;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/app/chemicals")
public class chemicalsApp {

    @GetMapping("/status")
    public String getStatus() {

        return "App working";
    }

    private List<chemicals> chemicals;

    public chemicalsApp() {
        chemicals = new ArrayList<>();
        chemicals.add(new chemicals(1L, "Apap", LocalDate.of(2034, 1, 1)));
        chemicals.add(new chemicals(2L, "Nospa", LocalDate.of(2023, 2, 2)));
        chemicals.add(new chemicals(3L, "Ranigast", LocalDate.of(2021, 2, 3)));
        chemicals.add(new chemicals(4L, "RanigastMax", LocalDate.of(2020, 2, 4)));
    }


    @GetMapping("/all")
    public List<chemicals> getAll() {
        return chemicals;
    }

    @GetMapping
    public chemicals getById(@RequestParam int index) {
        Optional<chemicals> first = chemicals.stream().
                filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @DeleteMapping // usuwa element
    public boolean deleteChemicals(@RequestParam int index) {
        return chemicals.removeIf(element -> element.getId() == index);
    }
}

