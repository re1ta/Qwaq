package com.backend.Qwaq.database;

import javax.persistence.*;

@Entity
@Table(name = "Questions")

public class Question {
    @Column(name = "Id_Test")
    private long Id_Test;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Question")
    private long Id_Question;

    @Column(name = "Text_Question")
    private String Text_Question;

    @Column(name = "Answer1")
    private String Answer1;

    @Column(name = "Answer2")
    private String Answer2;

    @Column(name = "Answer3")
    private String Answer3;

    @Column(name = "Answer4")
    private String Answer4;

    @Column(name = "Correct_Answer")
    private String Correct_Answer;

    public void setText_Question(String text_Question) {
        Text_Question = text_Question;
    }

    public String getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(String answer1) {
        Answer1 = answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(String answer2) {
        Answer2 = answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public void setAnswer3(String answer3) {
        Answer3 = answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public void setAnswer4(String answer4) {
        Answer4 = answer4;
    }

    public String getCorrect_Answer() {
        return Correct_Answer;
    }

    public void setCorrect_Answer(String correct_Answer) {
        Correct_Answer = correct_Answer;
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
}
