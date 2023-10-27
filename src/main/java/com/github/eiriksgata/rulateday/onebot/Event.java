package com.github.eiriksgata.rulateday.onebot;


public class Event {

    private String id;
    private Long time;
    private String type;
    private String detail_type;
    private String sub_type;

    private Self self;

    Event(String id, Long time, String type, String detail_type, String sub_type, Self self) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.detail_type = detail_type;
        this.sub_type = sub_type;
        this.self = self;
    }

    public static Event.EventBuilder builder() {
        return new Event.EventBuilder();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDetail_type(String detail_type) {
        this.detail_type = detail_type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public Long getTime() {
        return time;
    }

    public Self getSelf() {
        return self;
    }

    public String getDetail_type() {
        return detail_type;
    }

    public String getId() {
        return id;
    }

    public String getSub_type() {
        return sub_type;
    }

    public static class EventBuilder {
        private String id;
        private Long time;
        private String type;
        private String detail_type;
        private String sub_type;

        private Self self;

        EventBuilder() {
        }

        public Event.EventBuilder time(Long time) {
            this.time = time;
            return this;
        }

        public Event.EventBuilder type(String name) {
            this.type = type;
            return this;
        }

        public Event.EventBuilder type(EventTypeEnum eventTypeEnum) {
            this.type = eventTypeEnum.name();
            return this;
        }

        public Event.EventBuilder detail_type(String id) {
            this.id = id;
            return this;
        }

        public Event.EventBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Event.EventBuilder self(Self self) {
            this.self = self;
            return this;
        }


        public Event build() {
            return new Event(
                    this.id, this.time, this.type, this.detail_type, this.sub_type, this.self
            );
        }

        public String toString() {
            return "Event.EventBuilder(" +
                    "id=" + this.id +
                    ", time=" + this.time +
                    ", type=" + this.type +
                    ", detail_type=" + this.detail_type +
                    ", sub_type=" + this.sub_type +
                    ", self=" + this.self +
                    ")";
        }


    }


}
