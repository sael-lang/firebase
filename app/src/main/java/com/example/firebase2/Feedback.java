package com.example.firebase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Feedback {
    private String Id;
    private String Name;
    private String Feedback;
    public Feedback() {}

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getFeedback() {
        return Feedback;
    }
    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
}