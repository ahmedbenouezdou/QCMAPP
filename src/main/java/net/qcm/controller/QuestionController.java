package net.qcm.controller;

import net.qcm.model.Question;
import net.qcm.service.IQuestionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by benouezdouahmed on 06/09/2014.
 */
@Controller
@RequestMapping("/questions")
public class QuestionController {

    static final Logger logger = Logger.getLogger(QuestionController.class);


    public static final class QuestionsPage {
        public final int total, offset;
        public final List<Question> page;

        public QuestionsPage(int total, int offset, List<Question> page) {
            this.total = total;
            this.offset = offset;
            this.page = page;
        }
    }

    @Autowired
    private IQuestionService questionService ;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public QuestionsPage list(@RequestParam(value = "offset", defaultValue = "0") int offset, @RequestParam(value = "count", defaultValue = "3") int questionsPerPage) {
        List<Question> questions = questionService.listQuestion(offset, 3);
        return new QuestionsPage(questionService.questionsCount(), offset, questions);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public QuestionsPage create(@RequestBody Question question) {

        logger.info("je suis la dans la question");
        List<Question> questions = questionService.listQuestion(0, 3);
        questionService.addQuestion(question);

        return new QuestionsPage(questionService.questionsCount(), 0, questions);
    }

    @RequestMapping(value="/delete",method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public void deleteQuestion(@RequestParam(value= "idQuestion") int idQuestion){
        logger.info(idQuestion);
       boolean deleteQuestion= questionService.deletQuestion(idQuestion);
    }

    @RequestMapping(value="/udate", method=RequestMethod.POST)
    @ResponseBody
    public void updateQuesiton(){

    }

}
