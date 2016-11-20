package unq.api.model;

import java.io.Serializable;

/**
 * Created by mrivero on 19/11/16.
 */
public class SurveyStudentData implements Serializable {

    private int cantStudents;
    private int cantSurveys;

    public SurveyStudentData(int cantStudents, int cantSurveys) {
        this.cantStudents = cantStudents;
        this.cantSurveys = cantSurveys;
    }
}
