package com.java.lesson.lesson82;

public enum ProcessorType implements Descriptional {
    SEND("отправлено") {
        @Override
        public String description() {
            return super.description();
        }

//        @Override
//        public String Descriptional() {
//            return "сообщение отправлено клиенту";
//        }
    },
    REJECT("отменено банком"),
    TO_SIGN("подписано");


    public final String title;

    ProcessorType(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String description() {
        return "default";
    }



}
