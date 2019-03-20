package pl.swakon.pharmacy.dao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class chemicals {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private LocalDate ExpirationDate;

    public chemicals() { }


    public chemicals(Long id, String title, LocalDate ExpirationDate) {
        this.id = id;
        this.title = title;
        this.ExpirationDate = ExpirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getExpirationDate() {
        return ExpirationDate;
    }

    public void setexpirationDate(LocalDate expirationDate) {
        this.ExpirationDate = ExpirationDate;
    }
}



