package com.olegyashcherov;

import java.util.List;
import java.util.Objects;

public class PersonEntity {
    private long id;
    private String name;
    private PersonSetting setting;

    private List<PersonEntity> friendsList;
    private List<PhotoEntity> photoBank;
    private List<DocumentEntity> documents;

    public PersonEntity(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonSetting getSetting() {
        return setting;
    }

    public void setSetting(PersonSetting setting) {
        this.setting = setting;
    }

    public List<PersonEntity> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<PersonEntity> friendsList) {
        this.friendsList = friendsList;
    }

    public List<PhotoEntity> getPhotoBank() {
        return photoBank;
    }

    public void setPhotoBank(List<PhotoEntity> photoBank) {
        this.photoBank = photoBank;
    }

    public List<DocumentEntity> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentEntity> documents) {
        this.documents = documents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
