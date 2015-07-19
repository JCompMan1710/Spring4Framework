package com.programcreek.helloworld.service;
import java.util.ArrayList;
import java.util.List;
import com.programcreek.helloworld.model.Languages;

public class LanguagesManager {
    private static List<Languages> languageList;

    public LanguagesManager() {
    	languageList = new ArrayList<Languages>();
    	languageList.add(new Languages(1, "Java", "Spring"));
    	languageList.add(new Languages(2, "Java", "Spring MVC"));
    	languageList.add(new Languages(3, "Java", "JSF"));
//    	languageList.add(new Langugaes(4, "Java", "Eclipse IDE"));
    }

    public List<Languages> getLanguageList() {
        return languageList;
    }

    public Languages addLanguages(Languages l) {
        Languages languages = new Languages();
        languages.setId(languageList.size()+1);
        languages.settechnology(l.getTechnology());
        languages.setLanguage(l.getLanguage());
        languageList.add(languages);
        return languages;
    }
}