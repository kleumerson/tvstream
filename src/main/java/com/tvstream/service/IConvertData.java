package com.tvstream.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> classe);
}
