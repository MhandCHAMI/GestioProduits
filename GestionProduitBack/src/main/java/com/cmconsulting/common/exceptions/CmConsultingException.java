package com.cmconsulting.common.exceptions;

public class CmConsultingException extends  Throwable {

    private  CmConsultingStatus cmConsultingStatus;

    public CmConsultingException(final CmConsultingStatus cmConsultingStatus, Throwable cause){
        super(cmConsultingStatus.getMessage());
        this.cmConsultingStatus=cmConsultingStatus;
    }

    public CmConsultingException(final CmConsultingStatus cmConsultingStatus){
        this(cmConsultingStatus, null);
    }

    public CmConsultingStatus getCmConsultingStatus(){
        return this.cmConsultingStatus;
    }
}
