package com.filipe.pintura;

public class pinturaCone {

	private final double pi = 3.14;
	private double raio;
	private double geratriz;
	private double altura;
	private double areafundo;
	private double arealateral;
	private double areatotal;
	private double litros;
	private double latas;
	private double valortotal;
	private int tipo;
	
	public pinturaCone (double raio, double altura,int tipo , double geratriz) {
		this.geratriz = geratriz;
		this.raio = raio;
		this.tipo = tipo;
		this.altura = altura;
		areaFundo();
		areaTotal();
		areaLateral();
		calculaLitros();
		calculaLatas();
		calculaPreço();
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getGeratriz() {
		return geratriz;
	}
	
	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double getPi() {
		return pi;
	}
	
	@Override
	public String toString() {
		return "pinturaCone [pi=" + pi + ", raio=" + raio + ", geratriz=" + geratriz + ", altura=" + altura + ", tipo="
		+ tipo + "]";
	}
	
	public void areaFundo() {
		areafundo = ((raio*raio)*pi);
	}
	
	public void areaTotal() {
		areatotal = (raio*pi*(raio+geratriz));
	}
	
	public void areaLateral() {
		arealateral = (areatotal - areafundo);
	}
	
	public void calculaLitros() {
		litros = (areatotal*3.45);
	}
	
	public void calculaLatas() {
		latas = (litros/18);
		latas = Math.ceil(latas);
	}
	
	public void calculaPreço() {
	if(tipo==1){
		valortotal = (latas*238.90);
	}else if(tipo==2) {
		valortotal = (latas*467.98);
	}else{
		valortotal = (latas*758.34);
	}
}
	
	public String finalizar() {
		StringBuilder output = new StringBuilder();
		output.append("Raio: "+raio);
		output.append("\nAltura: "+altura);
		output.append("\nGeratriz: "+geratriz);
		output.append("\nÁrea do fundo: "+areafundo);
		output.append("\nÁrea Lateral: "+arealateral);
		output.append("\nÁrea total: "+areatotal);
		output.append("\nLitros: "+litros);
		output.append("\nLatas: "+latas);
		output.append("\nPreço total: "+valortotal+" R$.");
	
		return output.toString();
	}
}
