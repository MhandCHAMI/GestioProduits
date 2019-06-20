package com.cmconsulting.common.exceptions;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.NotNull;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.*;
import static com.fasterxml.jackson.annotation.JsonInclude.*;

@JsonInclude(value = Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility =Visibility.NON_PRIVATE)
@Data
@AllArgsConstructor
public class Response {


    @NotNull
    @JsonProperty("status")
    private String status;

    @NotNull
    @JsonProperty("code")
    private int code;


    @JsonProperty("message")
    private String message;

    @JsonProperty("body")
    private String body;


    public Response(int code, TypeErreurEnum type, String message) {
    }
}
