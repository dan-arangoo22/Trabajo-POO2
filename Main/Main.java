package Main;

import java.util.*;

import vehiculos.Buses;
import vehiculos.Carro;
import vehiculos.Moto;
import vehiculos.PropietarioV;
import vehiculos.Servicios;
import vehiculos.Tvehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		PropietarioV pro1 = new PropietarioV ("juan camilo guerrero");
		Servicios serv1 = new Servicios ("particular");
		
		
		
		PropietarioV pro2 = new PropietarioV ("luis alvarez");
		Servicios serv2 = new Servicios ("publico");
		
		
		
		PropietarioV pro3 = new PropietarioV ("andres quintero ");
		Servicios serv3 = new Servicios ("publico ");
		
		
		
		Carro c1 = new Carro ( 12345 , pro1 , serv1);
		Tvehiculo b1 = new Buses  ( 56789 , pro2 , serv2 );
		Moto m1  = new Moto (00001 , pro3 , serv3);
		
		
		List <Tvehiculo> vehiculos = new ArrayList<>();
		
		vehiculos.add(c1);
		vehiculos.add(b1);
		vehiculos.add(m1);
		
		HashMap<Integer, Tvehiculo> mapavehiculos = new HashMap<Integer, Tvehiculo>();
		
		
		for (Tvehiculo VehiculoActual : vehiculos) {

			mapavehiculos.put(VehiculoActual.getPlaca(), VehiculoActual);
			
			System.out.println("ingresar la placa");

			Integer placa = sc.nextInt();
			
			System.out.println("¿que vehiculo tiene usted ?");

			System.out.println("1) una moto.");
			System.out.println("2) un carro.");
			System.out.println("3) un bus.");
			
			int veh = sc.nextInt();

			Tvehiculo dato = mapavehiculos.get(placa);
			switch (veh) {

			case 1:

				String x = "moto";

				System.out.println("propietario: " + dato.getPropietario().getNombre() + " ; Tipo de servicio: "
						+ dato.getServicios().getTipo() + " ; El tipo de vehiculo es: " + x);

				System.out.println("");

				m1.Consultar();

				break;
				
			case 2:

				String y = "carro";

				System.out.println("Propietario: " + dato.getPropietario().getNombre() + " ; Tipo de servicio: "
						+ dato.getServicios().getTipo() + " ; El tipo de vehiculo es: " + y);

				System.out.println("");

				c1.Consultar();

				break;
				
			case 3:

				String z = "bus";

				System.out.println("Propietario: " + dato.getPropietario().getNombre() + " ; Tipo de servicio: "
						+ dato.getServicios().getTipo() + " ; El tipo de vehiculo es: " + z);

				System.out.println("");

				b1.Consultar();

				break;

			default:

				System.out.println("No manejamos esa clase de vehiculos");

				break;
				
				
			}
			

		}
	}
}
