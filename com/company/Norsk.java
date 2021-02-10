package com.company;

public class Norsk implements Dialog {
    private String s = "Norsk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Tast Q hvis du vil slutte, eller trykk enter for å fortsette";
    }

    @Override
    public String displayLanguage() {
        return "Du valgte sproget: ";
    }

    @Override
    public String contryCodes() {
        return Dialog.super.contryCodes();
    }


}
