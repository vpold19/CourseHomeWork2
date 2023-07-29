package com.example.coursework2_generateexamquestions.Service;

import com.example.coursework2_generateexamquestions.Exceptions.QuestionAlreadyExistException;
import com.example.coursework2_generateexamquestions.Exceptions.QuestionNotFoundException;
import com.example.coursework2_generateexamquestions.Exceptions.StorageIsEmptyException;
import com.example.coursework2_generateexamquestions.Model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>();
    private static final Random RANDOM = new Random();

    @Override
    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    @Override
    public Question add(Question question) {
        if (questions.add(question)) {
            return question;
        }
        throw new QuestionAlreadyExistException();
    }

    @Override
    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        throw new QuestionNotFoundException();
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        if(questions.isEmpty()){
            throw new StorageIsEmptyException();
        }
        int index = RANDOM.nextInt(questions.size());
        return questions.stream().
                skip(index)
                .findFirst()
                .orElseThrow(QuestionNotFoundException::new);
    }
}
