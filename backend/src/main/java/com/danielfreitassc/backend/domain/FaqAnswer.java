package com.danielfreitassc.backend.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FaqAnswer {
    private String[] keyWords;
    private String answer;
}
