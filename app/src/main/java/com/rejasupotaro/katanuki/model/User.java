package com.rejasupotaro.katanuki.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "users")
public class User extends Model {

    @Column(name = "name") public String name;
}
