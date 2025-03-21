package com.Quiz.app.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quizz_question")
@Getter
@Setter

public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    private String title ;
    private String answer ;

    @Lob
    private  String contect ;

    @ElementCollection
    @CollectionTable(name = "question_option", joinColumns = @JoinColumn(name =  "question_id"))
    @Column(name = "Option_text")
    List<String>  option = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;





}
