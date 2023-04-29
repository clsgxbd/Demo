package com.demo.commen.result;

public class ResultDTO<T> {
    public static final ResultDTO<VoidDTO> VOID = new ResultDTO(new VoidDTO());
    private T data;

    public ResultDTO() {
    }

    public ResultDTO(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "ResultDTO{data=" + this.data + '}';
    }
}
