package com.company.todo.iterator;

import com.company.todo.model.ToDo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoIterable implements Iterable<ToDo> {
    private List<ToDo> toDos;

    public TodoIterable() {
        toDos = new ArrayList<>();
    }

    public void add(ToDo toDo) {
        toDo.setId(toDos.size() + 1);
        toDos.add(toDo);
    }

    @Override
    public Iterator<ToDo> iterator() {
        return new TodoIterator(toDos);
    }
}
