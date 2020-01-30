package edu.miu.cs.cs544.lab01.dao;


public class Fortune {
    private Integer id;
    private String fortune;

    public Fortune(){

    }
    public Fortune(Integer id, String fortune) {
        this.id = id;
        this.fortune = fortune;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFortune() {
        return fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }
}
