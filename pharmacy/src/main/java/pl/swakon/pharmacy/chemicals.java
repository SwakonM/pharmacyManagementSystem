package pl.swakon.pharmacy;


import java.time.LocalDate;

public class chemicals {
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



