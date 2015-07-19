package com.programcreek.helloworld.model;

public class Languages {
    private int id;
    private String technology;
    private String language;

    public Languages(){
    }

    public Languages(int id, String technology, String language) {
        this.id = id;
        this.technology = technology;
        this.language = language;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTechnology() {
        return technology;
    }
    public void settechnology(String technology) {
        this.technology = technology;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}