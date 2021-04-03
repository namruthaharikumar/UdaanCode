package com.namrutha.quizApp;

import java.util.HashMap;
import java.util.List;
public class QuizApp {
    HashMap<String, List<Quiz>> quizHashMap;
    public HashMap<String, List<Quiz>> getQuizHashMap() {
        return quizHashMap;
    }

    public void setQuizHashMap(HashMap<String, List<Quiz>> quizHashMap) {
        this.quizHashMap = quizHashMap;
    }

    public QuizApp(HashMap<String, List<Quiz>> quizHashMap) {
        this.quizHashMap = quizHashMap;
    }
    public void createQuestion(String field, List<Quiz> quiz) {
       this.quizHashMap.put(field, quiz);
    }
    public List<Quiz> listQuizzesOnCategory(String category) {
        return this.quizHashMap.get(category);
    }

}
