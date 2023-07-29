package com.example.coursework2_generateexamquestions;

import com.example.coursework2_generateexamquestions.Model.Question;
import com.example.coursework2_generateexamquestions.Service.JavaQuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;



public class JavaQuestionServiceTest {
    JavaQuestionService javaQuestionService = new JavaQuestionService();
    @Test
    void add(){
        Question q1 = javaQuestionService.add(new Question("What is your name?", "Name"));
        Question q2 = javaQuestionService.add(new Question("Are you clever?", "Sometimes"));
        javaQuestionService.add(q1);
        javaQuestionService.add(q2);

        Collection<Question> actual = javaQuestionService.getAll();
        Assertions.assertEquals(2,actual.size());
        Assertions.assertTrue(actual.contains(new Question("What is your name?","Name")));
        Assertions.assertTrue(actual.contains(new Question("Are you clever?","Sometimes")));
    }
}
