package br.com.intelech.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uf {
	private final List<String> estados = new ArrayList<String>();
	
	public Uf(){
		estados.add("AC");
		estados.add("AL");
		estados.add("AP");
		estados.add("AM");
		estados.add("BA");
		estados.add("CE");
		estados.add("DF");
		estados.add("ES");
		estados.add("GO");
		estados.add("MA");
		estados.add("MT");
		estados.add("MS");
		estados.add("MG");
		estados.add("PA");
		estados.add("PB");
		estados.add("PR");
		estados.add("PE");
		estados.add("PI");
		estados.add("RJ");
		estados.add("RN");
		estados.add("RS");
		estados.add("RO");
		estados.add("RR");
		estados.add("SC");
		estados.add("SP");
		estados.add("SE");
		estados.add("TO");
	}

	public List<String> getEstados(){
		// retorna uma lista imutável. Não será alterada a lista de forma alguma
		return Collections.unmodifiableList(estados);
	}	
}

