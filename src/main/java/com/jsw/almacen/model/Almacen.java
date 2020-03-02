package com.jsw.almacen.model;

public class Almacen {
	private String idAlmacen;
	private String detalle;
	private String lugar;
	private boolean estado;
	private TipoEnum tipo;
	
	public String getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public TipoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}  
	
}
