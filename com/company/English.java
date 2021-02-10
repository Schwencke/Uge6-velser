package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "press Q to quit the app or return to continue";
    }

    @Override
    public String displayLanguage() {
        return "the selected language is: ";
    }

    @Override
    public String contryCodes() {
        return Dialog.super.contryCodes();
    }

}
