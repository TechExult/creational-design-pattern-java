package com.techexult.designpatterns.factory;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public abstract class Phone {

    protected ArrayList<Specification> specifications = new ArrayList<Specification>();

    public Phone() {
        createPhone();
    }

    protected abstract void createPhone();

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Phone{");
        sb.append("specifications=").append(specifications);
        sb.append('}');
        return sb.toString();
    }
}