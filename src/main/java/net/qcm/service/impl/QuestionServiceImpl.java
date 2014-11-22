package net.qcm.service.impl;

import net.qcm.mappers.QuestionMapper;
import net.qcm.model.Question;
import net.qcm.model.Reponse;
import net.qcm.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService {

    private final List<Question> listQuestion;
    @Autowired
    QuestionMapper questionMapper;

    public QuestionServiceImpl() {
        listQuestion = new ArrayList<Question>();
        List<Reponse> reponseList = new ArrayList<Reponse>();
        reponseList.add(new Reponse(1, "reponse1", true));
        reponseList.add(new Reponse(2, "reponse2", false));
        reponseList.add(new Reponse(3, "reponse3", false));
        listQuestion.add(new Question(1, "question1", reponseList, true));
        listQuestion.add(new Question(2, "question2", reponseList, false));
        listQuestion.add(new Question(3, "question3", reponseList, true));

        listQuestion.add(new Question(4, "question4", reponseList, true));
        listQuestion.add(new Question(5, "question5", reponseList, false));
        listQuestion.add(new Question(6, "question6", reponseList, true));

        listQuestion.add(new Question(7, "question7", reponseList, true));
        listQuestion.add(new Question(8, "question8", reponseList, false));
        listQuestion.add(new Question(9, "question9", reponseList, true));
        listQuestion.add(new Question(10, "question10", reponseList, false));
    }

    @Override
    public int questionsCount() {
        return listQuestion.size();
    }

    @Override
    public List<Question> listQuestion(int offset, int count) {
        return questionMapper.getAllQuestion();
//        if (offset >= listQuestion.size()) {
//            return Collections.emptyList();
//        }
//        if (offset + count >= listQuestion.size()) {
//            count = listQuestion.size() - offset;
//        }
//        return listQuestion.subList(offset, offset + count);
    }

    @Override
    public Boolean addQuestion(Question newQuestion) {

        return null;
    }

    @Override
    public Boolean deletQuestion(int idQuestion) {
        questionMapper.deleteQuestion(idQuestion);
        return null;
    }

    @Override
    public Boolean updateQuestion(int idQuestion, Question updQuestion) {
        return null;
    }
}
