package com.company;

public class Italian implements Dialog{
    private String s = "Italian";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Premere Q per uscire, o premere Invio per continuare";
    }

    @Override
    public String displayLanguage() {
        return "La lingua choocen è: ";
    }

    @Override
    public String contryCodes() {
        return Dialog.super.contryCodes();
    }


}
