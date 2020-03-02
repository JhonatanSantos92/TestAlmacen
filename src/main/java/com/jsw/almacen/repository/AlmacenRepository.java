package com.jsw.almacen.repository;

import java.util.List;

import com.jsw.almacen.model.Almacen;

public interface AlmacenRepository {
	Almacen crearAlmacen(Almacen almacen);
	List<Almacen> obtenerAlmacen();
}
