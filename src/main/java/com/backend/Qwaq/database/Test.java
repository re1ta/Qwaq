package com.backend.Qwaq.database;

import javax.persistence.*;

@Entity
@Table(name = "Tests")

public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Test")
    private long Id_Test;

    @Column(name = "Id_User")
    private long Id_User;

    @Column(name = "Count_Question")
    private long Count_Question;

    @Column(name = "Name_Test")
    private String Name_Test;

    public long getId_Test() {
        return Id_Test;
    }

    public void setId_Test(long id_Test) {
        Id_Test = id_Test;
    }

    public long getId_User() {
        return Id_User;
    }

    public void setId_User(long id_User) {
        Id_User = id_User;
    }

    public long getCount_Question() {
        return Count_Question;
    }

    public void setCount_Question(long count_Question) {
        Count_Question = count_Question;
    }

    public String getName_Test() {
        return Name_Test;
    }

    public void setName_Test(String name_Test) {
        Name_Test = name_Test;
    }
}
