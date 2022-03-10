package com.example.offlinequizz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    // List of Questions for the "JAVA" Quizz
    private static List<QuestionsList> administratorQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("A user attempts to log in to Salesforce from an IP address that is outside the login IP range on the user's profile but within the organization-wide trusted IP range. What will happen ? ", "The user will be able to log in after the computer is activated.", "The user will be able to log in after answering one security question.", "The user will be able to log in without activating the computer.", "The user will be unable to log in at all.", "The user will be unable to log in at all.", "");
        final QuestionsList question2 = new QuestionsList("Which configuration action should be performed to ensure every Case gets assigned to a valid Owner ?", "Configure a default value for the Case Owner field.", "Create a Validation Rule based on the Created By field.", "Create a Workflow Rule that checks for a blank Owner field.", "Define the Default Case Owner in Support Settings.", "Define the Default Case Owner in Support Settings.", "");
        final QuestionsList question3 = new QuestionsList("An administrator is creating a flow with several steps. How can he check is work as he's developing the flow?", "Perform the same steps manually via the UI", "Use debug logs in the Developer Console", "Use the Debug tool in the flow builder", "Use debug logs found in Setup", "Use the Debug tool in the flow builder", "");
        final QuestionsList question4 = new QuestionsList("How should the System Administrator implement biweekly notifications for Sales Reps that include Opportunities that need attention based on the Opportunity Owner's last login, past due Opportunities, and all Opportunities that have not been updated in the last 30 days?", "Create Scheduled Dashboards.", "Create Scheduled Reports.", "Create Opportunity Update Reminders.", "Create a Chatter Group.", "Create Opportunity Update Reminders.", "");
        final QuestionsList question5 = new QuestionsList("What is the maximum number of components that can be added to a single Dashboard?", "20", "3", "50", "15", "20", "");
        final QuestionsList question6 = new QuestionsList("Sales representatives use a custom report type for Account reports. New fields have been created on the Account Object. An administrator needs to report on the newly created fields. What should the administrator do to achieve this goal ?", "Create a new account report and add the new fields from the Report Builder.", "Create a new account report folder, go to share, and then add the new fields.", "From the Custom Report Type, Edit Object Relationships, then add the new fields to the report.", "From the Custom Report Type, Edit Layout, then add the new fields to the report.", "From the Custom Report Type, Edit Layout, then add the new fields to the report.", "");
        final QuestionsList question7 = new QuestionsList("A sales manager recently left the company and the Salesforce administrator has received the urgent request to deactivate their username. Because the sales manager was part of several approval processes, it is taking longer than expected. What should you do ?", "Freeze the User record.", "Reset the User password.", "Change the User profile.", "Change the User email address.", "Freeze the User record.", "");
        final QuestionsList question8 = new QuestionsList("Where does an administrator control field-level security for users ?", "Sharing rule", "Role", "Profile", "User", "Profile", "");
        final QuestionsList question9 = new QuestionsList("What should a System Administrator do to organize the fields available on a report?", "Modify the standard report type.", "Enable Dynamic Reports.", "Edit the Report Builder layout.", "Create a custom report type.", "Create a custom report type.", "");
        final QuestionsList question10 = new QuestionsList("A company has asked its Administrator to automatically set some fields when a Lead is created. What is the best way for the administrator to perform this automation ?", "Use Process Builder that launches a flow", "Use a Screen Flow with default values", "Record Triggered-Flow that runs Before save", "Create 1 Workflow rule per field", "Record Triggered-Flow that runs Before save", "");
        final QuestionsList question11 = new QuestionsList("What should the System Administrator check when users are unable to find a CustomReport Type ?", "Make sure the new Report Type is deployed.", "Make sure the user Profile includes the Report Type.", "Add the new Report Type to the related objects.", "Add a button for the new Report Type to the Report Builder.", "Make sure the new Report Type is deployed.", "");
        final QuestionsList question12 = new QuestionsList("A company is experiencing quality assurance issues with a product line. An administrator needs to use a standard object to track the extent of the problem.  Which standard object should be used ?", "Case", "Account", "Opportunity", "Product", "Case", "");

        // Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);


        return questionsLists;
    }

    // List of Questions for the "PHP" Quizz
    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a question along with options and answer
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


        return questionsLists;
    }

    // List of Questions for the "HTML" Quizz
    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
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


        return questionsLists;
    }

    // List of Questions for the "Android" Quizz
    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
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
