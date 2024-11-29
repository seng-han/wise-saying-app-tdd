package com.ll.domain.wiseSaying.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 이 전부를 매개변수로 하는 생성자 자동으로 만들어줌
/*public WiseSaying(int id, String content, String author) {
    this.id = id;
    this.content = content;
    this.author = author;
}*/

@Getter
@Setter
public class WiseSaying {
    private int id;
    private String content;
    private String author;

    public boolean isNew() {
        return id == 0;
    }
}