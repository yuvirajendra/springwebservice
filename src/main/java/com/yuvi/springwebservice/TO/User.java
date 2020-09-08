package com.yuvi.springwebservice.TO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    @JsonProperty(value = "id")
    private int Id;

    @JsonProperty(value = "name")
    private String name;

    public User(int id, String name) {
        Id = id;
        this.name = name;
    }
}
