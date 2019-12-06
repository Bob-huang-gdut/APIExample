package com.fengwenyi.api_example.handler;

import com.fengwenyi.api_example.util.ApiResultUtils;
import com.fengwenyi.api_result.model.ApiResultModel;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理
 * @author Erwin Feng[xfsy_2015@163.com]
 * @since 2019/12/6 17:48
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    /*============= 请求错误 start ==============================================*/

    /**
     * HTTP 请求方式不支持异常
     * HttpRequestMethodNotSupportedException
     * @return {@link ApiResultModel}
     */
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ApiResultModel<?, ?> httpRequestMethodNotSupportException(HttpRequestMethodNotSupportedException e, HttpServletRequest request) {
        return ApiResultUtils.error(1101, "请求方式不支持异常");
    }

    /*============= 请求错误 end ==============================================*/

}
