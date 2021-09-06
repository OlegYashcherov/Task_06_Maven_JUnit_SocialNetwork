package com.olegyashcherov;

import com.olegyashcherov.dao.Dao;

import java.util.ArrayList;
import java.util.List;

public class WallDao implements Dao<PostEntity> {

    private List<PostEntity> postEntities;

    private static WallDao instance;
    private static final Object LOCK = new Object();

    public WallDao() {
        postEntities = new ArrayList<>();
    }

    public static WallDao getInstance() {
        synchronized (LOCK) {
            if (instance == null) {
                instance = new WallDao();
            }
        }
        return instance;
    }

    @Override
    public List<PostEntity> getAll() {
        return null;
    }

    @Override
    public PostEntity getById(long l) {
        return null;
    }

    @Override
    public long insert(PostEntity postEntity) {
        return 0;
    }

    @Override
    public void delete(PostEntity postEntity) {

    }
}
