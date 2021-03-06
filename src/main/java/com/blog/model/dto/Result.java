package com.blog.model.dto;

import java.util.List;

/**
 * @author status404
 * @version V1.0
 * @date 2018/1/9
 */
import com.blog.model.enums.CodeEnum;
import java.util.List;
public class Result<T> {
    //状态码
    private int Code =0;
    //是否成功
    private boolean success =false;
    //成功时返回的数据
    private T result;
    //错误信息
    private String error;
    private int totalCount;



    public Result(){

    };
    public Result(boolean success){
        this.success=success;
        this.error="系统发生错误";
    }
    public Result(boolean success, T result){
        if(success){
            this.Code=CodeEnum.SUCCESS.getIndex();
        }
        this.success=success;
        this.result=result;
    }
    public Result(boolean success,String error){
        this.success=success;
        this.error=error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        this.Code = code;
    }
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    @Override
    public String toString() {
        return "{" +
                "\"Code\":" + Code +
                ",\"success\":" + success +
                ",\"result\":" + result +
                ",\"error\":" + "\""+error+"\"" +
                "}";
    }
}
