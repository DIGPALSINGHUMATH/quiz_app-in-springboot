package com.Quiz.app.controller;

import com.Quiz.app.Entity.Question;
import com.Quiz.app.reposity.Question_java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/question")
@CrossOrigin("*")
public class QuestionController {

    @Autowired
    private Question_java questionJava;

    @GetMapping
    public List<Question> GetAllQuestion(){

        return  questionJava.findAll();
    }

    @PostMapping
    public Question CreateAllQuestion(@RequestBody Question question){

        return questionJava.save(question);
    }




}
