package com.ojas.gst.response;

import org.springframework.http.HttpStatus;

public class Response {

	private Integer statusCode;
	private String responseMessage;
	private Object responseData;
	private Object responseDataList;
	private Long totalRecords;
	private Integer totalPages;
	private String status;
	private HttpStatus errorCode;
	private HttpStatus status_code;
	private String errorMessage;
	private String message;
	private ExceptionType exceptionType;
	private Object resultData;
	private int count;
	private int pages;
	private boolean result;

	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(Object resultData, String status) {
		this.status = status;
		this.resultData = resultData;
	}

	public Response(String status, HttpStatus status_code, String message) {
		super();
		this.status = status;
		this.status_code = status_code;
		this.message = message;
	}

	public Response(String status, String errorMessage, HttpStatus errorCode) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Response(String status, HttpStatus status_code, String message, Object resultData) {
		super();
		this.status = status;
		this.status_code = status_code;
		this.message = message;
		this.resultData = resultData;
	}

	public Response(Object resultData, HttpStatus status_code, String message) {
		this.resultData = resultData;
		this.status_code = status_code;
		this.message = message;
	}

	public Response(Object resultData, int pages, int count, HttpStatus status_code, String status) {
		this.resultData = resultData;
		this.setPages(pages);
		this.status_code = status_code;
		this.status = status;
		this.count = count;
	}

	public Response(String status, HttpStatus errorCode, String errorMessage, ExceptionType exceptionType) {
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exceptionType = exceptionType;
	}

	public Response(Object resultData, String status, HttpStatus errorCode, String errorMessage,
			ExceptionType exceptionType) {
		this.resultData = resultData;
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exceptionType = exceptionType;
	}

	public Response(String status, HttpStatus errorCode) {
		this.status = status;
		this.errorCode = errorCode;
	}

	public Response(Object resultData, HttpStatus errorCode, String errorMessage, ExceptionType exceptionType) {
		this.resultData = resultData;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exceptionType = exceptionType;
	}
	
	public Response(Object resultData,boolean result, HttpStatus errorCode, String errorMessage) {
		this.resultData = resultData;
		this.result = result;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Response(boolean result, HttpStatus errorCode, String errorMessage) {
		this.result = result;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}

	public Object getResponseDataList() {
		return responseDataList;
	}

	public void setResponseDataList(Object responseDataList) {
		this.responseDataList = responseDataList;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public HttpStatus getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}

	public HttpStatus getStatus_code() {
		return status_code;
	}

	public void setStatus_code(HttpStatus status_code) {
		this.status_code = status_code;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExceptionType getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(ExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}

	public Object getResultData() {
		return resultData;
	}

	public void setResultData(Object resultData) {
		this.resultData = resultData;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
