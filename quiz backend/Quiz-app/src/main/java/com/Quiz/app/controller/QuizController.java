package com.Quiz.app.controller;


import com.Quiz.app.Entity.Quiz;
import com.Quiz.app.reposity.QuizRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/quizzes")
@CrossOrigin("*")
//@NoRepositoryBean
public class QuizController  {

    @Autowired
    private QuizRepo quizRepository ;

    @GetMapping
    public List<Quiz> Getallquiz(){

        return quizRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> CreateQuiz(@RequestBody Quiz quiz){
        if(quiz == null || quiz.getName() == null){
            return ResponseEntity.badRequest().body("quiz are invalide");
        }
        Quiz SaveQuiz = quizRepository.save(quiz);
        return  ResponseEntity.ok(SaveQuiz);
    }



}
