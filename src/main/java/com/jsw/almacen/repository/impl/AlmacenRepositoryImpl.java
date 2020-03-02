package com.jsw.almacen.repository.impl;

import java.util.ArrayList;
import java.util.List;


import com.jsw.almacen.model.Almacen;
import com.jsw.almacen.repository.AlmacenRepository;

public class AlmacenRepositoryImpl implements AlmacenRepository {

	private static List<Almacen> almacenBD = new ArrayList<Almacen>();
	
	@Override
	public Almacen crearAlmacen(Almacen almacen) {
		System.out.println("Crear Almacen");
		almacenBD.add(almacen);
		return almacen;
	}

	@Override
	public List<Almacen> obtenerAlmacen() {
		return almacenBD;
	}

}
