package com.jsw.almacen;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    String sayBye(String name);
}

