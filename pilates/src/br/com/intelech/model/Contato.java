package br.com.intelech.model;

public class Contato {
	
	private String email;
	private String telefonefixo;
	private String celular;
	private String telefoneComercial;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonefixo() {
		return telefonefixo;
	}
	public void setTelefonefixo(String telefonefixo) {
		this.telefonefixo = telefonefixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
}