package com.Quiz.app.reposity;

import com.Quiz.app.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Question_java extends JpaRepository<Question,Long> {

}
