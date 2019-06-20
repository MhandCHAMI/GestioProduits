package com.cmconsulting.core.service;

import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper
public interface MapperEntityDto<E,Dto> {

    E transfromToEntity(Dto dto);
    Dto transfromToDto(E entity);
   Collection<Dto> transformCollectionEntityToCollectionDto(Collection<E> collectionEntity);

}
