package com.cmconsulting.common.exceptions;

public class CmConsultingStatusInfo implements CmConsultingStatus {

    private final int code;
    private final TypeErreurEnum type;
    private final String message;

    public CmConsultingStatusInfo(int code, TypeErreurEnum type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }


    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public TypeErreurEnum getType() {
        return this.type;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Response getResponse() {
        return new Response(this.code, this.type, this.message);
    }

    @Override
    public Response geResponse(String customMessage) {
        return new Response(this.code, this.type, customMessage);
    }

    @Override
    public CmConsultingException getCmConsultingException() {
        return new CmConsultingException(this);
    }

    @Override
    public CmConsultingException getCmConsultingException(Throwable cause) {
        return null;
    }
}
