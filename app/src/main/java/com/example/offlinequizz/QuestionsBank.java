package com.example.offlinequizz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    // List of Questions for the "JAVA" Quizz
    private static List<QuestionsList> administratorQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        ArrayList options = new ArrayList();
        options.add("1");
        options.add("2");
        options.add("3");
        options.add("4");
        options.add("5");

        ArrayList answers = new ArrayList();
        answers.add("2");
        answers.add("5");


        final QuestionsList question1 = new QuestionsList(
                "A user attempts to log in to Salesforce from an IP address that is outside the login IP range on the user's profile but within the organization-wide trusted IP range. What will happen ? ",
                options,
                answers);

        final QuestionsList question2 = new QuestionsList(
                "A user attempts to log in to Salesforce from an IP address that is outside the login IP range on the user's profile but within the organization-wide trusted IP range. What will happen ? ",
                options,
                answers);

        final QuestionsList question3 = new QuestionsList(
                "A user attempts to log in to Salesforce from an IP address that is outside the login IP range on the user's profile but within the organization-wide trusted IP range. What will happen ? ",
                options,
                answers);

        // Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        return questionsLists;
    }

    // List of Questions for the "PHP" Quizz
    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        /*// Create object of QuestionsList class and pass a question along with options and answer
        final QuestionsList question1 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question3 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question4 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question5 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question6 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question7 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question8 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");

        // Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);

*/
        return questionsLists;
    }

    // List of Questions for the "HTML" Quizz
    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        /*// Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question3 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question4 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question5 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question6 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question7 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question8 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");

        // Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);

*/
        return questionsLists;
    }

    // List of Questions for the "Android" Quizz
    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        /* Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question2 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question3 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question4 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question5 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question6 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question7 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");
        final QuestionsList question8 = new QuestionsList("What is the size of int variable ?", "16 bit", "32 bit", "64 bit", "128 bit", "32 bit", "");

        // Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);

*/
        return questionsLists;
    }

    // Get the correct list of Questions according to the Topic chosen by the user
    public  static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "administrator":
                return administratorQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
