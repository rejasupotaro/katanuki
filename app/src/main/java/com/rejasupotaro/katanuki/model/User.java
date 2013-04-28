package com.rejasupotaro.katanuki.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import com.rejasupotaro.katanuki.entity.UserEntity;

@Table(name = "users")
public class User extends Model {

    @Column(name = "user_id") public String userId;
    @Column(name = "name") public String name;

    public User(){
        super();
    }

    public User(UserEntity entity){
        super();
        this.userId = entity.id;
        this.name = entity.name;
    }

    public static User findById(String userId) {
        return new Select()
        .from(User.class)
        .where("user_id = ?", userId)
        .executeSingle();
    }
}