package com.example.coursework2_generateexamquestions.Service;

import com.example.coursework2_generateexamquestions.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>(
    );
    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question,answer);
        return question1;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
