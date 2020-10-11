package com.hjr.demoForCors.Model;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {
        id = -1;
        content = "";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
