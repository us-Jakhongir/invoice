package com.example.appinvoice.dto.res;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {

    private String message;
    private boolean status;
    private Object object;

    public Response(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public Response(String message, boolean status, Object object) {
        this.message = message;
        this.status = status;
        this.object = object;
    }
}
