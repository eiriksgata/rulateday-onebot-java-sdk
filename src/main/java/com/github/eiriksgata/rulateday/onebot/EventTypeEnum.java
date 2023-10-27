package com.github.eiriksgata.rulateday.onebot;

public enum EventTypeEnum {

    META("meta", "元事件"),
    MESSAGE("message", "消息事件"),
    NOTICE("notice", "通知"),
    REQUEST("request", "请求事件")

    ;

    private String name;
    private String describe;

    EventTypeEnum(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }






}
