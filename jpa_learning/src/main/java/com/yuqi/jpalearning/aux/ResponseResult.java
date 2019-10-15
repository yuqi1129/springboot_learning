package com.yuqi.jpalearning.aux;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 16:03
 **/
@Data
@AllArgsConstructor
public class ResponseResult<T> {
    private T content;
    private int code;

    private String message;
}
