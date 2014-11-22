package net.qcm.service;

import net.qcm.model.Question;

import java.util.List;

/**
 * Created by benouezdouahmed on 11/11/2014.
 */
public interface IQuestionService {
    int questionsCount();

    List<Question> listQuestion(int offset, int count);

    Boolean addQuestion(Question newQuestion);

    Boolean deletQuestion(int idQuestion);

    Boolean updateQuestion(int idQuestion, Question updQuestion);

}
