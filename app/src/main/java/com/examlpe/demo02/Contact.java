package com.examlpe.demo02;

/**
 * Created by Zhou Hang on 2015/6/14.
 */
public class Contact {
    private String name;
    private String lasttalk;


    public Contact(String name,String lasttalk){
        setLasttalk(lasttalk);
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasttalk() {
        return lasttalk;
    }

    public void setLasttalk(String lasttalk) {
        this.lasttalk = lasttalk;
    }
}
