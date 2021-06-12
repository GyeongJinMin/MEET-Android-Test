package kr.ac.hansung.stt.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Emotion implements Serializable {

    private String emotion;

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }
}
