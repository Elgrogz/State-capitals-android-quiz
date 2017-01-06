package com.example.user.geographyquiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 05/01/2017.
 */
public class StateCapitalCollection {

    HashMap<String, String> states;
    String currentQuestion;
    String currentCorrectAnswer;
    ArrayList<String> questionBank;

    public StateCapitalCollection() {

        currentQuestion = null;
        currentCorrectAnswer = null;
        questionBank = new ArrayList<>();

        states = new HashMap<>();

        states.put("Alabama", "Montgomery");
        states.put("Alaska", "Juno");
        states.put("Arizona", "Phoenix");
        states.put("Arkansas", "Little Rock");
        states.put("California", "Sacramento");
        states.put("Colorado", "Denver");
        states.put("Connecticut", "Hartford");
        states.put("Delaware", "Dover");
        states.put("Florida", "Tallahassee");
        states.put("Georgia", "Atlanta");
        states.put("Hawaii", "Honolulu");
        states.put("Idaho", "Boise");
        states.put("Illinois", "Springfield");
        states.put("Indiana", "Indianapolis");
        states.put("Iowa", "Des Moines");
        states.put("Kansas", "Topeka");
        states.put("Kentucky", "Frankfort");
        states.put("Louisiana", "Baton Rouge");
        states.put("Maine", "Augusta");
        states.put("Maryland", "Annapolis");
        states.put("Massachusetts", "Boston");
        states.put("Michigan", "Lansing");
        states.put("Minnesota", "St. Paul");
        states.put("Mississippi", "Jackson");
        states.put("Missouri", "Jefferson City");
        states.put("Montana", "Helena");
        states.put("Nebraska", "Lincoln");
        states.put("Nevada", "Carson City");
        states.put("New Hampshire", "Concord");
        states.put("New Jersey", "Trenton");
        states.put("New Mexico", "Santa Fe");
        states.put("New York", "Albany");
        states.put("North Carolina", "Raleigh");
        states.put("North Dakota", "Bismark");
        states.put("Ohio", "Columbus");
        states.put("Oklahoma", "Oklahoma City");
        states.put("Oregon", "Salem");
        states.put("Pennsylvania", "Harrisburg");
        states.put("Rhode Island", "Providence");
        states.put("South Carolina", "Columbia");
        states.put("South Dakota", "Pierre");
        states.put("Tennessee", "Nashville");
        states.put("Texas", "Austin");
        states.put("Utah", "Salt Lake City");
        states.put("Vermont", "Montpelier");
        states.put("Virginia", "Richmond");
        states.put("Washington", "Olympia");
        states.put("West Virginia", "Charleston");
        states.put("Wisconsin", "Madison");
        states.put("Wyoming", "Cheyenne");
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
        return states;
    }

    public void getQuestionAndAnswer() {
        Random random = new Random();
        List<String> stateKeys = new ArrayList<>(states.keySet());
        String randomState = stateKeys.get(random.nextInt(stateKeys.size()));
        String capital = states.get(randomState);
        currentQuestion = randomState;
        currentCorrectAnswer = capital;
    }

    public ArrayList<String> fillQuestionBank() {
        questionBank.add(currentCorrectAnswer);
        List<String> stateValues = new ArrayList<>(states.values());

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
