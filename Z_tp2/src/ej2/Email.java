package ej2;

public class Email {

	private String cuenta;
	private String dominio;

	public Email(String datos) {

		String[] separacion;
		separacion = datos.split("@");

		cuenta = separacion[0];
		dominio = separacion[1];

	}

	public String getValor() {

		return cuenta + "@" + dominio;
	}

}
