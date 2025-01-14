package com.example.project;

public class plzwork {

    public static void main(String[] args) {
        IdGenerate c = new IdGenerate();
        System.out.println(c.getCurrentId());
        c.generateID();
        System.out.println(c.getCurrentId());
    }
}