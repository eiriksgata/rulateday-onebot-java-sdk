package com.github.eiriksgata.rulateday.onebot;

import com.alibaba.fastjson2.JSONObject;
import org.junit.jupiter.api.Test;

public class EventTest {

    @Test
    void eventTypeTest() {
        String result = JSONObject.toJSONString(Event.builder()
                .type(EventTypeEnum.META)
                .self(
                        Self.builder()
                                .platform("qq")
                                .user_id("123456").build()
                )
                .build());

        System.out.println(result);

    }
}
