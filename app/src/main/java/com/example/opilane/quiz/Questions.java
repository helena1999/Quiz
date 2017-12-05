package com.example.opilane.quiz;

/**
 * Created by opilane on 05.12.2017.
 */

public class Questions {
    //array of questions
    public String MyQuestion [] =  {
            "How many days are in february 2018?",
            "When is Christmas?",
            "When is Halloween?",
            "When is Thanksgiving in Canada?",
            "When is New Years Eve?",

    };
    //array of multiple choises for question
    public String MyChoises [] [] = {
            {"28","29","30","31"},
            {"24.december","25.december","23.december","26.december"},
            {"20.october","1.october","31.october","30.october"},
            {"10.october","1. october","9.october","1.november"},
            {"31.december","1.january","30.december","24.december"}
    };
    //array of correct answers - in the same order as array of questions
    private String MyCorrectAnswers [] = {
            "28", "24.december", "31.october", "9.october", "31.december"
    };
    //method returns number of questions
    public int getLenght(){
        return MyQuestion.length;
    }
    //method returns question from array textQuestions[] based array index
    public String getQuestion (int a){
        String question = MyQuestion[a];
        return question;
    }
    //method returns a single multiple choice item for question based on array indeks,
    //based on number of multiple choice item in the list - 1, 2, 3, 4 as an argument
    public String getChoice (int index, int num){
        String choice0=MyChoises[index][num -1];
        return choice0;
    }
    //method returns correct answer for the question based on array indeks
    public String getCorrectAnswer (int a){
        String answer = MyCorrectAnswers [a];
        return answer;
    }
    }
