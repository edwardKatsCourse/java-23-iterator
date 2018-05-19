package com.company.todo.iterator;

import com.company.todo.model.ToDo;

import java.util.Iterator;
import java.util.List;

public class TodoIterator implements Iterator<ToDo> {

    //    private int size;
    private int currentPosition;
    private List<ToDo> list;

    public TodoIterator(List<ToDo> list) {
        this.list = list;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
                //6                 6 = false
        return currentPosition < list.size();
    }

    @Override
    public ToDo next() {
        return list.get(currentPosition++); //currentPosition = 0
        //currentPosition = 1
    }

    @Override
    public void remove() {
//        int index = currentPosition - 1;
//        if (index < 0) {
//            throw new RuntimeException("No such index");
//        }
        list.remove(--currentPosition); //-1
    }
}
