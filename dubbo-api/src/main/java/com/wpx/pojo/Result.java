package com.wpx.pojo;

import java.io.Serializable;

/**
 * 用于接受 响应结果
 * 
 * @author wpx
 *
 */
public class Result implements Serializable {

	// 响应业务状态
	private Integer status;
	// 响应消息
	private String msg;
	// 响应的数据
	private Object data;

	public Result() {
	}

	public static Result ok() {
		return new Result(null);
	}

	public static Result ok(Object data) {
		return new Result(data);
	}

	public static Result build(Integer status, String msg) {
		return new Result(status, msg, null);

	}

	public Result(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public Result(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
