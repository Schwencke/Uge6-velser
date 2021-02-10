package com.company;

public interface Dialog {

    public String getLanguage();

    public String quit();

    public String displayLanguage();

    public default String contryCodes() {
        return "da/eng/it/no";
    }


    // find på to dialoger selv i gruppen.

}
