package com.bizi.sleep.domain;

import lombok.Data;

/**
 * @author tengyue
 */
@Data
public class User {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}