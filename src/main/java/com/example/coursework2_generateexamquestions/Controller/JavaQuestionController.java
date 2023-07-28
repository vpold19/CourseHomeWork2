package com.example.coursework2_generateexamquestions.Controller;

import com.example.coursework2_generateexamquestions.Question;
import com.example.coursework2_generateexamquestions.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello mothefuckers";
    }
   // @GetMapping("/Java/add")
//    public Question add(@RequestParam("question") String QuestionText, @RequestParam("answer")String QuestionAnswer){
//
//        //return questionService.add()}
//    }
}
