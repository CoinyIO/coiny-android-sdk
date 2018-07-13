package io.coiny.android.sdk.models;

public class BaseModel{

    public class BaseResponse<T> {
        private String status;
        private int errorCode;
        private ErrorResponse[] errors;
        private String message;
        private T data;

        public BaseResponse(String status, int errorCode, ErrorResponse[] errors, String message, T data) {
            this.status = status;
            this.errorCode = errorCode;
            this.errors = errors;
            this.message = message;
            this.data = data;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public ErrorResponse[] getErrors() {
            return errors;
        }

        public void setErrors(ErrorResponse[] errors) {
            this.errors = errors;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public class ArrayResponse<T> {
        private String status;
        private int errorCode;
        private ErrorResponse[] errors;
        private String message;
        private T[] data;

        public ArrayResponse(String status, int errorCode, ErrorResponse[] errors, String message, T[] data) {
            this.status = status;
            this.errorCode = errorCode;
            this.errors = errors;
            this.message = message;
            this.data = data;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public ErrorResponse[] getErrors() {
            return errors;
        }

        public void setErrors(ErrorResponse[] errors) {
            this.errors = errors;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public T[] getData() {
            return data;
        }

        public void setData(T[] data) {
            this.data = data;
        }
    }

    public class PaginatedResponse<T> {
        private int totalItemCount;
        private int currentPage;
        private int size;
        private int nextPage;
        private T[] data;

        public PaginatedResponse() {
        }

        public PaginatedResponse(int totalItemCount, int currentPage, int size, int nextPage, T[] data) {
            this.totalItemCount = totalItemCount;
            this.currentPage = currentPage;
            this.size = size;
            this.nextPage = nextPage;
            this.data = data;
        }

        public int getTotalItemCount() {
            return totalItemCount;
        }

        public void setTotalItemCount(int totalItemCount) {
            this.totalItemCount = totalItemCount;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getNextPage() {
            return nextPage;
        }

        public void setNextPage(int nextPage) {
            this.nextPage = nextPage;
        }

        public T[] getData() {
            return data;
        }

        public void setData(T[] data) {
            this.data = data;
        }
    }

    public class ErrorResponse {
        private String key;
        private int code;
        private String description;

        public ErrorResponse(String key, int code, String description) {
            this.key = key;
            this.code = code;
            this.description = description;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}