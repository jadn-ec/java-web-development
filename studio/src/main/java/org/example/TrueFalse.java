package org.example;

public class TrueFalse extends Question {
    private Boolean isTrue;
    private Boolean isFalse;

    public TrueFalse(String aQuestion, boolean aTrue){
        super(aQuestion);
        isTrue = aTrue;
    }

    public boolean isTrue() {return true;}
    public void setTrue(boolean aTrue) {isTrue = aTrue;}

}
