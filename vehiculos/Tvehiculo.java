package vehiculos;

import vehiculos.PropietarioV;
import vehiculos.Servicios;

public class Tvehiculo {

	private Integer placa;
	private PropietarioV propietario;
	private Servicios servicios;

	public Tvehiculo(Integer placa, PropietarioV propietario, Servicios servicios) {
		this.placa = placa;
		this.propietario = propietario;
		this.servicios = servicios;

	}

	public Integer getPlaca() {
		return placa;
	}

	public void setPlaca(Integer placa) {
		this.placa = placa;
	}

	public PropietarioV getPropietario() {
		return propietario;
	}

	public void setPropietario(PropietarioV propietario) {
		this.propietario = propietario;
	}

	public Servicios getServicios() {
		return servicios;
	}

	public void setServicios(Servicios servicios) {
		this.servicios = servicios;
	}

	public void Consultar() {
		// TODO Auto-generated method stub

	}

	

}
