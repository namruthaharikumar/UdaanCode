package com.namrutha.quizApp;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
@Controller
public class HelloWorld {
    public static void main(String[] args) {
        QuizApp quizApp = new QuizApp(new HashMap<String, List<Quiz>>());
        String question = "What is the national game of India?";
        String choice1 = "Cricket",choice2 = "Football",choice3 = "Hockey",choice4="Basketball",correctChoice="Hockey";
        Quiz quizQuestion = new Quiz(question,choice1,choice2,choice3,choice4,correctChoice);
        quizApp.createQuestion("India", Collections.singletonList(quizQuestion));
        List<Quiz> quizByCategory = quizApp.listQuizzesOnCategory("India");
        for(Quiz quiz: quizByCategory) {
            System.out.println(quiz.description);
            if(quiz.answerQuiz("Cricket")) {
                System.out.println("Correct answer");
            } else {
                System.out.println("Wrong answer");
            }
        }

    }
    @RequestMapping("/dummyCall")
    @ResponseBody
    public QuizApp dummyGetCall() {
        return new QuizApp(new HashMap<String, List<Quiz>>());
    }
}
