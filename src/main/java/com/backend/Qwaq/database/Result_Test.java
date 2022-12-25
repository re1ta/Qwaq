package com.backend.Qwaq.database;

import javax.persistence.*;

@Entity
@Table(name = "Result_Tests")

public class Result_Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num", nullable = false)
    private Long num;

    @Column(name = "Id_User")
    private long Id_User;
    @Column(name = "Id_Test")
    private long Id_Test;

    @Column(name = "Id_Question")
    private long Id_Question;

    @Column(name = "User_Answer")
    private String User_Answer;

    @Column(name = "Bool_answer")
    private boolean Bool_answer;

    public long getId_User() {
        return Id_User;
    }

    public void setId_User(long id_User) {
        Id_User = id_User;
    }

    public String getUser_Answer() {
        return User_Answer;
    }

    public void setUser_Answer(String user_Answer) {
        User_Answer = user_Answer;
    }

    public long getId_Test() {
        return Id_Test;
    }

    public void setId_Test(long id_Test) {
        Id_Test = id_Test;
    }

    public long getId_Question() {
        return Id_Question;
    }

    public void setId_Question(long id_Question) {
        Id_Question = id_Question;
    }

    public boolean isBool_answer() {
        return Bool_answer;
    }

    public void setBool_answer(boolean bool_answer) {
        Bool_answer = bool_answer;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Result_Test(){}

    public Result_Test(long id_User, long id_Test, long id_Question, String user_Answer, boolean bool_answer) {
        Id_User = id_User;
        Id_Test = id_Test;
        Id_Question = id_Question;
        User_Answer = user_Answer;
        Bool_answer = bool_answer;
    }

}
