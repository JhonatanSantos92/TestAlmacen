
package com.jsw.almacen;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jsw.almacen.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String sayBye(String name) {
		return "Bye " + name;
	}
}

