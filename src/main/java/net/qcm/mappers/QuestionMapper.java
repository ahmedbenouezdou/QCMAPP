package net.qcm.mappers;

import net.qcm.model.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by A15206 on 19/11/2014.
 */
public interface QuestionMapper {
    List<Question> getAllQuestion();

    List<Question> getlistQuestion(@Param("offset") int offset);

    void deleteQuestion(@Param("idQuestion") int idQuestion);

    //void insertQuestion(@Param("newQuestion") Question newQuestion);
}
