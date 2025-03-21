package com.Quiz.app.Entity;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "quiz_app")
@Getter
@Setter
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Lob
    private String Discription ;
    private LocalDate createDate;

    private boolean live = false ;
    private String banner;


    @OneToMany(mappedBy = "quiz" , cascade = CascadeType.ALL ,orphanRemoval = true   )
    private Set<Question> questions = new HashSet<>();



}
