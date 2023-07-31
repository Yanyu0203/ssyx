package org.yyy.ssyx.common.exception;

import lombok.Data;
import org.yyy.ssyx.common.result.ResultCodeEnum;

@Data
public class SsyxException extends RuntimeException{

    private Integer code;

    /**
     * Create Exception object with code
     * @param message
     * @param code
     */
    public SsyxException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * Get Enum
     * @param resultCodeEnum
     */
    public SsyxException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "GuliException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
