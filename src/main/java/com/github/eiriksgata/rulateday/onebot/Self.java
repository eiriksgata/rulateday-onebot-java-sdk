package com.github.eiriksgata.rulateday.onebot;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Self {
    private String platform;
    private String user_id;

}
