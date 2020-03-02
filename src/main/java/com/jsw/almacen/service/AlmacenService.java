package com.jsw.almacen.service;

import java.util.List;

import javax.jws.WebService;

import com.jsw.almacen.model.Almacen;

@WebService
public interface AlmacenService {
	Almacen crearAlmacen(Almacen almacen);
	List<Almacen> obtenerAlmacen();
}
