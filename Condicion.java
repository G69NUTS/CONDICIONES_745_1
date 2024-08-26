import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
	int dia_act =23;
	int mes_act =8;
	int year_act =2024;
    Scanner leer = new Scanner(System.in);
	System.out.println("la fecha de hoy es: "+dia_act+"/"+mes_act+"/"+year_act);
	System.out.println("Ingrese su nombre");
	String name;
	name = leer.next();
	System.out.println(name);
    System.out.println("Ingrese su year de nacimiento");
	int year_usuario = leer.nextInt();
    System.out.println("Ingrese su mes de nacimiento");
	int mes_usuario = leer.nextInt();
	System.out.println("Ingrese su dia de nacimiento");
	int dia_usuario = leer.nextInt();
	int resta =(year_act - year_usuario);
	System.out.println("Su edad es: "+resta);
	
	if(mes_usuario==1){
		
		if(dia_usuario<=19){
						System.out.println("Su signo del zodiaco es: Capricornio");
		}
		if(dia_usuario>=19){
						System.out.println("Su signo del zodiaco es: Acuario");
		}
	}
	
	if(mes_usuario==2){
		
		if(dia_usuario<=18){
						System.out.println("Su signo del zodiaco es: Acuario");
		}
		if(dia_usuario>=19){
						System.out.println("Su signo del zodiaco es: Piscis");
		}
	}
	
	if(mes_usuario==3){
		
		if(dia_usuario<=20){
						System.out.println("Su signo del zodiaco es: Piscis");
		}
		if(dia_usuario>=21){
						System.out.println("Su signo del zodiaco es: Aries");
		}
	}
	
	if(mes_usuario==4){
		
		if(dia_usuario<=19){
						System.out.println("Su signo del zodiaco es: Aries");
		}
		if(dia_usuario>=20){
						System.out.println("Su signo del zodiaco es: Tauro");
		}
	}
	
	if(mes_usuario==5){
		
		if(dia_usuario<=20){
						System.out.println("Su signo del zodiaco es: Tauro");
		}
		if(dia_usuario>=21){
						System.out.println("Su signo del zodiaco es: Geminis");
		}
	}

    if(mes_usuario==6){
		
		if(dia_usuario<=20){
						System.out.println("Su signo del zodiaco es: Geminis");
		}
		if(dia_usuario>=21){
						System.out.println("Su signo del zodiaco es: Cancer");
		}
	}
	
	if(mes_usuario==7){
		
		if(dia_usuario<=22){
						System.out.println("Su signo del zodiaco es: Cancer");
		}
		if(dia_usuario>=23){
						System.out.println("Su signo del zodiaco es: Leo");
		}
	}
	
	if(mes_usuario==8){
		
		if(dia_usuario<=22){
						System.out.println("Su signo del zodiaco es: Leo");
		}
		if(dia_usuario>=23){
						System.out.println("Su signo del zodiaco es: Virgo");
		}
	}
	
	if(mes_usuario==9){
		
		if(dia_usuario<=22){
						System.out.println("Su signo del zodiaco es: Virgo");
		}
		if(dia_usuario>=23){
						System.out.println("Su signo del zodiaco es: Libra");
		}
	}
	
	if(mes_usuario==10){
		
		if(dia_usuario<=22){
						System.out.println("Su signo del zodiaco es: Libra");
		}
		if(dia_usuario>=23){
						System.out.println("Su signo del zodiaco es: Escorpio");
		}
	}
	
	if(mes_usuario==11){
		
		if(dia_usuario<=21){
						System.out.println("Su signo del zodiaco es: Escorpio");
		}
		if(dia_usuario>=22){
						System.out.println("Su signo del zodiaco es: Sagitario");
		}
	}
	
	if(mes_usuario==12){
		
		if(dia_usuario<=21){
						System.out.println("Su signo del zodiaco es: Sagitario");
		}
		if(dia_usuario>=22){
						System.out.println("Su signo del zodiaco es: Capricornio");
		}
	}
	
  }
}
