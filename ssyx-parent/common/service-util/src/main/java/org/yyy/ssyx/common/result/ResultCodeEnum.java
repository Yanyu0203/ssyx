package org.yyy.ssyx.common.result;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "Success"),
    FAIL(201, "Fail"),
    SERVICE_ERROR(2012, "Service Error"),
    DATA_ERROR(204, "Data Error"),
    ILLEGAL_REQUEST(205, "Illegal Request"),
    REPEAT_SUBMIT(206, "Repeat Submission"),

    LOGIN_AUTH(208, "Not Logged in"),
    PERMISSION(209, "No Permission"),

    ORDER_PRICE_ERROR(210, "Order Price Error"),
    ORDER_STOCK_FALL(204, "Order Stock Failed"),
    CREATE_ORDER_FAIL(210, "Create Order Failed"),

    COUPON_GET(220, "Coupon Get"),
    COUPON_LIMIT_GET(221, "No Coupon Left"),

    URL_ENCODE_ERROR(216, "URL Encode Error"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(217, "Illegal Callback Request"),
    FETCH_ACCESSTOKEN_FAILD(218, "Get accessToken Failed"),
    FETCH_USERINFO_ERROR(219, "Fetch UserInfo Failed"),


    SKU_LIMIT_ERROR(230, "Can not buy stocks than limit"),
    REGION_OPEN(240, "Region Open"),
    REGION_NO_OPEN(240, "Region Not Open"),
    ;

    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
