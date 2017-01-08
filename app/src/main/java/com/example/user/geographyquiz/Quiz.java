package com.example.user.geographyquiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 08/01/2017.
 */
public abstract class Quiz {

    String currentQuestion;
    String currentCorrectAnswer;
    ArrayList<String> questionBank;
    HashMap<String, String> collection;

    public Quiz() {

        currentQuestion = null;
        currentCorrectAnswer = null;
        questionBank = new ArrayList<>();
        collection = new HashMap<>();

    }

    public String getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(String currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public String getCurrentCorrectAnswer() {
        return currentCorrectAnswer;
    }

    public void setCurrentCorrectAnswer(String currentCorrectAnswer) {
        this.currentCorrectAnswer = currentCorrectAnswer;
    }

    public HashMap getCollection() {
        return collection;
    }

    public void getQuestionAndAnswer() {
        Random random = new Random();
        List<String> stateKeys = new ArrayList<>(collection.keySet());
        String randomState = stateKeys.get(random.nextInt(stateKeys.size()));
        String capital = collection.get(randomState);
        currentQuestion = randomState;
        currentCorrectAnswer = capital;
    }

    public ArrayList<String> fillQuestionBank() {
        questionBank.clear();
        questionBank.add(currentCorrectAnswer);
        List<String> stateValues = new ArrayList<>(collection.values());

        while(questionBank.size() < 4) {
            int randomIndex = new Random().nextInt(stateValues.size());
            String randomCity = stateValues.get(randomIndex);
            if (randomCity != currentCorrectAnswer) {
                questionBank.add(randomCity);
            }
        }
        Collections.shuffle(questionBank);
        return questionBank;
    }

    public String getQuestionToString() {
        return "What is the capital of " + getCurrentQuestion() + "?";
    }

}
