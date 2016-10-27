package de.android.testtodeletecardviewwithrecyclerview.model;


public class Person {
    String name;
    String age;
    int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getPhotoId() {
        return photoId;
    }
}
