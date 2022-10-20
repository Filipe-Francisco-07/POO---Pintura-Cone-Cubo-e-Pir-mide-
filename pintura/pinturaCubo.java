package com.filipe.pintura;

public class pinturaCubo {

	private double lado;
	private double rendimento;
	private double area;
	private double litrostinta;
	private double latastinta;
	private double valortotal;
	private double volume;
	private double diagonal;
	private double areatotal;
	private int tipo;
	

	//arredondar : Math.ceil()
		
	public pinturaCubo (double lado, double rendimento, int tipo) {
		this.lado = lado;
		this.rendimento = rendimento;
		this.tipo = tipo;
		calculaArea();
		calculaLitro();
		finalizar();
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getRendimento() {
		return rendimento;
	}


	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "pinturaCubo [lado=" + lado + ", rendimento=" + rendimento + ", tipo=" + tipo + "]";
	}
	
	public void calculaArea() {
		area = lado*lado;	
		areatotal = (area*6);
		calculaVolume(area);
		calculaDiagonal(area);
	}
	
	public void calculaVolume(double area) {
		volume = ((lado*lado)*lado);	
	}
	
	public void calculaDiagonal(double area) {
		diagonal = (lado* Math.sqrt(3));	
	}
	
	public void calculaLitro() {
		litrostinta = (areatotal/rendimento);
		latastinta = (litrostinta/18);	
		latastinta = Math.ceil(latastinta);
		calculaTinta();
	}
	
	public void calculaTinta() {
		if(tipo == 1) {
			valortotal = (latastinta*101.90);
		}else if(tipo == 2) {
			valortotal = (latastinta*212.45);
		}else{
			valortotal = (latastinta*345.56);
		}
	}
	
	public String finalizar() {
		StringBuilder output = new StringBuilder();
		output.append("Lado do cubo: "+lado);
		output.append("\nRendimento: "+rendimento);
		output.append("\nTipo da tinta: "+tipo);
		output.append("\nÁrea da base: "+area);
		output.append("\nÁrea total: "+areatotal);
		output.append("\nVolume: "+volume);
		output.append("\nDiagonal do Cubo: "+diagonal);
		output.append("\nLitros de tinta: "+litrostinta);
		output.append("\nLatas de tinta: "+latastinta);
		output.append("\nValor total: "+valortotal+" R$.");
		
		return output.toString();
	}
	
}
