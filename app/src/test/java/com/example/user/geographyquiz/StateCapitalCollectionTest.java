package com.example.user.geographyquiz;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/01/2017.
 */
public class StateCapitalCollectionTest {


    StateCapitalCollection stateCollection;
    HashMap<String, String> states;

    @Before
    public void before() {
        stateCollection = new StateCapitalCollection();
        states = stateCollection.getCollection();
    }

    @Test
    public void canPopulateStates() {
        assertEquals(50, states.size());
    }

//    @Test
//    public void canGetQuestionAndAnswer() {
//        stateCollection.getQuestionAndAnswer();
//        System.out.println(stateCollection.getCurrentQuestion());
//        System.out.println(stateCollection.getCurrentCorrectAnswer());
//    }

    @Test
    public void canGetQuestionBank() {
        stateCollection.getQuestionAndAnswer();
        System.out.println(stateCollection.getCurrentQuestion());
        System.out.println(stateCollection.fillQuestionBank());
    }
}
