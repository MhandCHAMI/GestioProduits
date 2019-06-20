package com.cmconsulting.common.exceptions;

public interface CmConsultingStatus {
    int getCode();
    TypeErreurEnum getType();
    String getMessage();
    Response getResponse();
    Response geResponse(String customMessage);
    CmConsultingException getCmConsultingException();
    CmConsultingException getCmConsultingException(final  Throwable cause);


}
