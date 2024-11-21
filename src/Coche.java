public class Coche{
	
	public String matricula;
	private int motor;
	public String color;
	private boolean radio= false;
	private String marca= "????????????";
	
	public Coche() {
	}
	public Coche(String _matricula, int _motor, String _color, boolean _radio)
	{
		this.matricula = _matricula;
		this.color= _color;
		this.motor= _motor;
		this.radio= _radio;
	}
	public Coche(String _matricula, int _motor, String _color, boolean _radio,String _marca)
	{
		this.matricula = _matricula;
		this.color= _color;
		this.motor= _motor;
		this.radio= _radio;
		this.marca= _marca;
	}	
	public int getMotor() {
		return this.motor;
	}
	public boolean getRadio() {
		return radio;
	}
	public void setMotor(int motor) {
		this.motor= motor;
	}
	public void setRadio(boolean radio) {
		this.radio= radio;
	}
	public void setMarca(String marca) {
		this.marca= marca;
	}
	public void FichaTecnica() {
		System.out.println("FICHA AUTOMÓVIL");
		System.out.println("---------------");
		System.out.println("Matrícula :" + this.matricula);
		System.out.println("Motor : " + this.getMotor());
		System.out.println("Color : " + this.color);
		System.out.println("Tiene Radio : " + this.getRadio());
		System.out.println("--------------\n" + this.marca);
	}
}