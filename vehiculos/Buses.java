package vehiculos;
import java.util.Scanner;


public class Buses extends Tvehiculo  {
	
 	public Buses  (Integer placa , PropietarioV propietario , Servicios servicios ) {
		super( placa , propietario , servicios );
	
	
 	}
 	
 	public void consultar() {
		System.out.println( "¿usted paga mensualidad en el parqueadero?");
		System.out.println( "1) si");
		System.out.println( "2) no");
		
		
		Scanner sc = new Scanner(System.in);
		
		int opt = sc.nextInt();
		switch (opt) {

		case 1:

			System.out.println("usted puede salir");

			break;

		case 2:

			System.out.println("¿cuantas horas has estado usadon el parqueadero?");

			int num = sc.nextInt();

			System.out.println(" ");

			if (num > 6) {

				int saldo = (num - 6) * 5;

				System.out.println("su recargo adicional es de: " + saldo + "%");

			} else {

				System.out.println("su recarga es del 5%");

			}

			break;

		default:
			System.out.println(" opcion invalida");

			break;
			
		}
 	}
}
