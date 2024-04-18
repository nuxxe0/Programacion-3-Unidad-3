
public class Player {


	//atributos 
	private int x,y,largo, alto;
	private String color;
	
	public Player(int x, int y, int largo,int alto, String color){
		this.x=x;
		this.y=y;
		this.largo=largo;
		this.alto=alto;
		this.color=color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean colision(int x)
	{
		return false;
	}
	
	
	
}
