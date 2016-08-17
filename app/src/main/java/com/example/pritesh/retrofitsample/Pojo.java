package com.example.pritesh.retrofitsample;

/**
 * Created by yashwant on 7/27/2016.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Pojo {

    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("0")
    @Expose
    private com.example.pritesh.retrofitsample._0 _0;

    /**
     *
     * @return
     * The success
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The _0
     */
    public com.example.pritesh.retrofitsample._0 get0() {
        return _0;
    }

    /**
     *
     * @param _0
     * The 0
     */
    public void set0(com.example.pritesh.retrofitsample._0 _0) {
        this._0 = _0;
    }

}