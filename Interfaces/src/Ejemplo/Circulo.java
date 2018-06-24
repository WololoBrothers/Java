package Ejemplo;

public class Circulo implements Coloreable{	
	   private double x, y, radio;	   
	   Circulo(double x, double y, double radio){
	      this.x = x;
	      this.y = y;
	      this.radio= radio;
	   }
	   @Override
	   public void dibujar(int color){
	      System.out.println("Circulo dibujado con(" + x + ", " + y + 
	                         "), con radio " + radio + ", y borde de color " + color);
	   }
	   double getRadius(){
	      return radio;
	   }
	   double getX(){
	      return x;
	   }
	   double getY(){
	      return y;
	   }
	@Override
	public void colorear(int color){	
	      System.out.println("Circulo coloreado con color " + color);
	}
}