package com.cmconsulting.common.exceptions;

public enum CmConsultingGlobalStatusEnum implements CmConsultingStatus{
    SUCCES(0, TypeErreurEnum.N, "success"),
    TECHNICAL_ERROR_UNKNOWN(1, TypeErreurEnum.T, "Technical Error Unknown"),
    FUNCTIONAL_ERROR_UNKNOWN(2, TypeErreurEnum.T, "Functional Error Unknown"),
    ENTITY_UNKNOWN(3, TypeErreurEnum.N, "Entity Unknown"),
    ENTITY_ALREADY_EXISTS(4, TypeErreurEnum.N, "Entity Already Exists"),
    TECHNICAL_ERROR(4, TypeErreurEnum.N, "Entity Already Exists");
    

    private CmConsultingStatusInfo cmConsultingStatusInfo;


    CmConsultingGlobalStatusEnum(final int code, final  TypeErreurEnum type, final String message) {
        this.cmConsultingStatusInfo = new CmConsultingStatusInfo(code, type, message);
    }

    @Override
    public int getCode() {
        return this.cmConsultingStatusInfo.getCode();
    }

    @Override
    public TypeErreurEnum getType() {
        return this.cmConsultingStatusInfo.getType();
    }

    @Override
    public String getMessage() {
        return this.cmConsultingStatusInfo.getMessage();
    }

    @Override
    public Response getResponse() {
        return this.cmConsultingStatusInfo.getResponse();
    }

    @Override
    public Response geResponse(String customMessage) {
        return this.cmConsultingStatusInfo.geResponse(customMessage);
    }

    @Override
    public CmConsultingException getCmConsultingException() {
        return this.cmConsultingStatusInfo.getCmConsultingException();
    }

    @Override
    public CmConsultingException getCmConsultingException(Throwable cause) {
        return this.cmConsultingStatusInfo.getCmConsultingException(cause);
    }
}
