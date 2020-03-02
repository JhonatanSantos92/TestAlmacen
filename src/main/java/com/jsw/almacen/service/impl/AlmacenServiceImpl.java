package com.jsw.almacen.service.impl;

import java.util.List;

import javax.jws.WebService;

import com.jsw.almacen.model.Almacen;
import com.jsw.almacen.repository.AlmacenRepository;
import com.jsw.almacen.repository.impl.AlmacenRepositoryImpl;
import com.jsw.almacen.service.AlmacenService;

@WebService(endpointInterface = "com.jsw.almacen.service.AlmacenService")
public class AlmacenServiceImpl implements AlmacenService{
	AlmacenRepository almacenRepository = new AlmacenRepositoryImpl();

	@Override
	public Almacen crearAlmacen(Almacen almacen) {
		return almacenRepository.crearAlmacen(almacen);
	}

	@Override
	public List<Almacen> obtenerAlmacen() {
		return almacenRepository.obtenerAlmacen();
	}
	
			
}
