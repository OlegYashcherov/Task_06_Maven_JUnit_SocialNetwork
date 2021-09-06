package com.olegyashcherov;

import com.olegyashcherov.DocumentEntity;
import com.olegyashcherov.PersonEntity;
import com.olegyashcherov.PhotoEntity;

import java.util.Date;
import java.util.List;

public class PostEntity {
    private Long id;
    private Date date;
    private PersonEntity author;
    private String content;
    private List<PhotoEntity> photoList;
    private List<DocumentEntity> documentList;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PersonEntity getAuthor() {
        return author;
    }

    public void setAuthor(PersonEntity author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<PhotoEntity> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<PhotoEntity> photoList) {
        this.photoList = photoList;
    }

    public List<DocumentEntity> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<DocumentEntity> documentList) {
        this.documentList = documentList;
    }
}
