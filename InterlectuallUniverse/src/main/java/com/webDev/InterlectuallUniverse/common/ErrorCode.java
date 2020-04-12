package com.webDev.InterlectuallUniverse.common;

import lombok.Getter;

public enum  ErrorCode {
    SUCCESS(0),
    EXISTING_DATA(1),
    NOT_FOUND_DATA(2);

    private final int code;


    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }


}
