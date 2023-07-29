package com.example.coursework2_generateexamquestions.Service;

import com.example.coursework2_generateexamquestions.Model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question>getQuestion(int amount);
}
