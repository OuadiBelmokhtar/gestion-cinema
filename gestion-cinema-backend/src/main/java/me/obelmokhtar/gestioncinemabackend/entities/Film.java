package me.obelmokhtar.gestioncinemabackend.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private Integer duree;
    private String realisateur;
    private String description;
    private String photo;
    @Temporal(TemporalType.DATE)
    private Date dateSortie;
}
