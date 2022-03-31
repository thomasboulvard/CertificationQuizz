package com.example.offlinequizz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsList {

    private String question;
    private List<String> options;

    private List<String> answer;


    // Constructor
    public QuestionsList(String question, ArrayList options, ArrayList answer) {
        this.question = question;
        this.options = new ArrayList();
        this.options = options;
        this.answer = new ArrayList();
        this.answer = answer;
    }


    // Getter
    public String getQuestion() {
        return question;
    }


    public List<String> getOptions() {
        return options;
    }

    public List<String> getAnswer() {
        return answer;
    }
}
