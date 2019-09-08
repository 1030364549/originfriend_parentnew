package entity;

/**
 * @Classname Result
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/9/5 14:24
 * @Created by Happy-微冷的雨
 */

/**
 * 结果类型的Bean
 */
public class Result {
    private boolean flag;  //执行结果  成功或者是失败
    private Integer code;  //返回的状态码
    private String message; //提示信息
    private Object data;   //数据本身

    public Result() {
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
