package com.example.crow_theater;

import android.widget.EditText;

public class MovieDescription {
    private EditText txtNameReg;
    private EditText txtDescriptionReg;
    private EditText txtGradeReg;

    String name = txtNameReg.getText().toString();
    String description = txtDescriptionReg.getText().toString();
    String grade = txtGradeReg.getText().toString();

    public MovieDescription(){
    }

    public MovieDescription(String name, String description, String grade){
        this.name = name;
        this.description = description;
        this.grade = grade;
    }

    public EditText getTxtNameReg(){
        return txtNameReg;
    }

    public void setTxtNameReg(EditText txtNameReg) {
        this.txtNameReg = txtNameReg;
    }

    public EditText getTxtDescriptionReg() {
        return txtDescriptionReg;
    }

    public void setEmail(String email) {
        this.txtDescriptionReg = txtDescriptionReg;
    }

    public EditText getTxtGradeReg(){
        return txtGradeReg;
    }

    public void setTxtGradeReg(EditText txtGradeReg) {
        this.txtNameReg = txtGradeReg;
    }
}
