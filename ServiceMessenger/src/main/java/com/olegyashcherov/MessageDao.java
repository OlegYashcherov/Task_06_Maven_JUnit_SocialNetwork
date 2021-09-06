package com.olegyashcherov;

import com.olegyashcherov.dao.Dao;

import java.util.List;

public class MessageDao implements Dao<MessageEntity> {

    private static MessageDao instance;
    private static final Object LOCK = new Object();

    public static MessageDao getInstance() {
        synchronized (LOCK) {
            if (instance == null) {
                instance = new MessageDao();
            }
        }
        return instance;
    }

    @Override
    public List<MessageEntity> getAll() {
        return null;
    }

    @Override
    public MessageEntity getById(long l) {
        return null;
    }

    @Override
    public long insert(MessageEntity messageEntity) {
        return 0;
    }

    @Override
    public void delete(MessageEntity messageEntity) {

    }
}
