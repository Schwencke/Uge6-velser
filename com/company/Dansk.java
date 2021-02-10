package com.company;

public class Dansk implements Dialog {

    private String s = "dansk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryk Q for at stoppe eller enter for at fortsætte";
    }

    @Override
    public String displayLanguage() {
        return "det valgte sprog er: ";
    }

    @Override
    public String contryCodes() {
        return Dialog.super.contryCodes();
    }

}
