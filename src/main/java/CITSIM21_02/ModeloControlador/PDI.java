package CITSIM21_02.ModeloControlador;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : ModeloControlador.PDI.java
//  @ Date : 13/05/2022
//  @ Author : 
//
//


import CITSIM21_02.Enumeradores.TCategoria;

public class PDI extends Observador {
	private String identificadorEmpleado;
	private TCategoria categoria;

	public PDI(String correo)
	{
		this.correo=correo;
	}

	public PDI(String correo, String contrasenia, String nombre, String primerApellido,
			   String segundoApellido, String DNI, Perfil perfil,
			   String identificadorEmpleado, TCategoria categoria) {
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.DNI = DNI;
		this.perfil = perfil;
		this.identificadorEmpleado = identificadorEmpleado;
		this.categoria = categoria;
	}
	public String getIdentificadorEmpleado() {
		return identificadorEmpleado;
	}

	public TCategoria getCategoria() {
		return categoria;
	}

	public void setIdentificadorEmpleado(String indentificadorEmpleado) {
		this.identificadorEmpleado = identificadorEmpleado;
	}

	public void setCategoria(TCategoria categoria) {
		this.categoria = categoria;
	}
}
