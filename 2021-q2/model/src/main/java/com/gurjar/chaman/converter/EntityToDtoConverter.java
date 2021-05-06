package com.gurjar.chaman.converter;

/*
@author: Chaman Gurjar
@version: 1.0. 06-May-2021;
*/

public interface EntityToDtoConverter<T1, T2> {

    /**
     * This method is used to convert.
     * @param  obj = Entity.
     * @return T2 = DTO.
     */
    T2 convert(T1 obj);
}
