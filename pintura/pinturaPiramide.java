package com.filipe.pintura;

public class pinturaPiramide {

	private double altura;
	private double ab;
	private double A1;
	private double AreaTri;
	private double Areabase;
	private double Areatotal;
	private double Litros;
	private double Latas;
	private double Preço;
	private double volume;
	private int tipo;
	
	public pinturaPiramide (double ab, double altura , int tipo) {
		this.altura= altura;
		this.ab = ab;
		this.tipo = tipo;
		calculaA1();
		calculaAreatri();
		calculaAreabase();
		calculaAreatotal();
		calculaVolume();
		calculaLitros();
		calculaLatas();
		calculaValor();
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAb() {
		return ab;
	}

	public void setAb(double ab) {
		this.ab = ab;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "pinturaPiramide [altura=" + altura + ", ab=" + ab + ", tipo=" + tipo + "]";
	}	
	
	public void calculaA1() {
		A1 = Math.sqrt((ab * ab) + (altura*altura));
	}
	
	public void calculaAreatri() {
		AreaTri = (A1 * ab);
	}
	
	public void calculaAreabase() {
		Areabase = ((ab+ab)*(ab+ab));
	}
	
	public void calculaAreatotal() {
		Areatotal = ((AreaTri*4)+Areabase);
	}
	
	public void calculaVolume() {
		volume = ((Areabase/3)*altura);
	}
	
	public void calculaLitros() {
		Litros = (Areatotal / 4.76);
	}
	
	public void calculaLatas() {
		Latas = (Litros / 18);
		Latas = Math.ceil(Latas);
	}
	
	public void calculaValor() {
		if(tipo == 1) {
			Preço = (Latas*127.90);
		}else if(tipo == 2) {
			Preço = (Latas*258.98);
		}else{
			Preço = (Latas*344.34);
		}
	}
	
	public String finalizar() {
		StringBuilder output = new StringBuilder();
		output.append("ab: "+ab);
		output.append("\naltura: "+altura);
		output.append("\na1: "+A1);
		output.append("\nÁrea do triângulo: "+AreaTri);
		output.append("\nÁrea da base: "+Areabase);
		output.append("\nÁrea total: "+Areatotal);
		output.append("\nTipo de tinta: "+tipo);
		output.append("\nLitros: "+Litros);
		output.append("\nLatas: "+Latas);
		output.append("\nPreço: "+Preço);
		output.append("\nVolume: "+volume);
		
		return output.toString();
	}
	
}
