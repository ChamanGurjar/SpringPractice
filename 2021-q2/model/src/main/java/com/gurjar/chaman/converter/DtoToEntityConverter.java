package com.gurjar.chaman.converter;

/*
@author: Chaman Gurjar
@version: 1.0. 06-May-2021;
*/

public interface DtoToEntityConverter<T1, T2> {

    /**
     * This method is used to convert.
     * @param  obj = DTO.
     * @return T2 = ENTITY.
     */
    T2 convert(T1 obj);
}
