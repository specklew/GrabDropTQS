package tqs.example.impostor.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    private Long id;

    private

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}