package cn.bugkit.serialization.components;

/**
 * @author bugkit
 * @since 2022.2.25
 */
public class HttpResponse {

    private Result result;
    private Object data;


    public HttpResponse(Result result, Object data) {
        this.result = result;
        this.data = data;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpResponse{" +
                "result=" + result +
                ", data=" + data +
                '}';
    }
}
