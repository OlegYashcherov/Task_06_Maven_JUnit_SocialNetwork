package com.olegyashcherov;

import com.olegyashcherov.dao.Dao;

import java.util.List;

public class DocumentDao implements Dao<DocumentEntity> {
    @Override
    public List<DocumentEntity> getAll() {
        return null;
    }

    @Override
    public DocumentEntity getById(long l) {
        return null;
    }

    @Override
    public long insert(DocumentEntity documentEntity) {
        return 0;
    }

    @Override
    public void delete(DocumentEntity documentEntity) {

    }
}
