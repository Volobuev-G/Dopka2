package com.dop;

public class StudentsTasksAttempts {
    private String lastName;
    private int taskNumber;
    private int attemptNumber;
    private int score;

    public StudentsTasksAttempts(String lastName, int taskNumber, int attemptNumber) {
        this.lastName = lastName;
        this.taskNumber = taskNumber;
        this.attemptNumber = attemptNumber;
    }

    public StudentsTasksAttempts(String lastName, int taskNumber, int attemptNumber, int score) {
        this.lastName = lastName;
        this.taskNumber = taskNumber;
        this.attemptNumber = attemptNumber;
        this.score = score;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public int getScore() {
        return score;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
