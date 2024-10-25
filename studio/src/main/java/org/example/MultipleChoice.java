package org.example;

public class MultipleChoice extends Question {
    private Integer numberOfOptions;

    public MultipleChoice(String aQuestion, Integer numberOfChoices) {
        super(aQuestion);
        numberOfOptions = numberOfChoices;
    }

    public Integer getNumberOfOptions() {
        return numberOfOptions;
    }

    public void setNumberOfOptions(Integer numberOfOptions) {
        this.numberOfOptions = numberOfOptions;
    }
}
