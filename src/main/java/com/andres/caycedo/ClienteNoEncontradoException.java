package com.andres.caycedo;

public class ClienteNoEncontradoException extends RuntimeException {

    public ClienteNoEncontradoException (String message){
        super(message);
    }
}
