package io.lamar.chucknorrisjokes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Value {

    private Long id;
    private String joke;
    private String[] categories;

    public Value(){

    }

    public Long getId() {
        return this.id;
    }

    public String getJoke() {
        return this.joke;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", joke='" + joke + '\'' +
                '}';

    }
}
