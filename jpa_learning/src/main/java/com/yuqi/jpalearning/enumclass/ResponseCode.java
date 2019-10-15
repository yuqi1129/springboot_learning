package com.yuqi.jpalearning.enumclass;


/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 16:07
 **/
public enum ResponseCode {
    /**
     * 正常返回
      */
    SUCCESS(200, "success", 0),
    /**
     * 404
     */
    FILE_NOT_FOUND(404, "File not found...", 1),

    /**
     * server error
     */
    SERVER_ERROR(500, "Server error...", 2);


    private int code;
    private String message;
    private int index;

    ResponseCode(int code, String message, int index) {
        this.code = code;
        this.message = message;
        this.index = index;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getIndex() {
        return index;
    }

    public static ResponseCode getByCode(int code) {
        for (ResponseCode responseCode : ResponseCode.values()) {
            if (code == responseCode.code) {
                return responseCode;
            }
        }

        return null;
    }
}
