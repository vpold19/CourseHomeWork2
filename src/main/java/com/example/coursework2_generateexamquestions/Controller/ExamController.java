package com.example.coursework2_generateexamquestions.Controller;

import com.example.coursework2_generateexamquestions.Model.Question;
import com.example.coursework2_generateexamquestions.Service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@RequestParam(name = "amount") int amount){
        return examinerService.getQuestion(amount);
    }

}
