package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Receipe recipe;

    @Lob
    private String receipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Receipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Receipe recipe) {
        this.recipe = recipe;
    }

    public String getReceipeNotes() {
        return receipeNotes;
    }

    public void setReceipeNotes(String receipeNotes) {
        this.receipeNotes = receipeNotes;
    }
}