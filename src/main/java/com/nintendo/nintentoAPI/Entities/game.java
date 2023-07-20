package com.nintendo.nintentoAPI.Entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Blob;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
public class game {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   private String name;
   private Double price;
   private String releaseDate;
   private Double numberPlayers;
   private String genre;
   private String publisher;
   private String ESRBRating;
   private String SupportedPlayModes;
   private Double GameFileSize;
   private String SupportedLanguages;
   private String imagen;

}
