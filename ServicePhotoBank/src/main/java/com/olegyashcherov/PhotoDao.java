package com.olegyashcherov;

import com.olegyashcherov.PhotoEntity;
import com.olegyashcherov.dao.Dao;

import java.util.List;

public class PhotoDao implements Dao<PhotoEntity> {
    @Override
    public List<PhotoEntity> getAll() {
        return null;
    }

    @Override
    public PhotoEntity getById(long l) {
        return null;
    }

    @Override
    public long insert(PhotoEntity photoEntity) {
        return 0;
    }

    @Override
    public void delete(PhotoEntity photoEntity) {

    }
}
