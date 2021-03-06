package preconfiguracion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Domicilio;
import domain.Estado;
import domain.Insumo;
import domain.Item;
import domain.OrdenDeCompra;
import domain.Proveedor;

public class OrdenesLoader
{
	List<OrdenDeCompra> ordenes;
	
	//Cualquier otra clase como proveedores e insumos la deberia hacer otro cargador de datos;
	public OrdenesLoader()
	{
		ProveedoresLoader  proveedoresLoader = new ProveedoresLoader();
		InsumosLoader insumosLoader ;
//		ordenes = new ArrayList<OrdenDeCompra>();
//		Proveedor proveedor1 = new Proveedor("29-55000111-6", "Laboratorios labo SRL", new Domicilio("Calle 23",99));
//		Proveedor proveedor2 = new Proveedor("27-454544-4", "Laboratorios labo SRL", new Domicilio("Calle 23",99));
//		Proveedor proveedor3 = new Proveedor("56-678509-0", "Laboratorios labo SRL", new Domicilio("Calle 23",99));
//		Proveedor proveedor4 = new Proveedor("72-255545-9", "Laboratorios labo SRL", new Domicilio("Calle 23",99));
//		List<Item> items = new ArrayList<Item>();
//		
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(2, "Tornillos"), 27, 0));
//		items.add(new Item(new Insumo(3, "Acido Muriatico"), 9, 0));
//		items.add(new Item(new Insumo(4, "Motosierra"), 4, 0));
//		items.add(new Item(new Insumo(5, "Poxiram"), 12, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor1, items, 0 ));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor2, items, 0 ));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor3, items, 0 ));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor1, items, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor4, items, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor3, items, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		items.add(new Item(new Insumo(1, "Tuerca"), 5, 0));
//		ordenes.add(new OrdenDeCompra(1, proveedor4, items, 0));
		BufferedReader br = null;
		FileReader fr = null;

		try {

			if(System.getProperties().getProperty("os.name").contains("Linux"))
			{
				String dir = System.getProperty("user.dir");
				System.out.println(dir);
				fr = new FileReader(dir+"/resources/archivos/insumos.txt");
			}
			else
			{
				
				fr = new FileReader("C:\\Users\\alumnos\\Desktop\\insumos.txt");

			}
			
		} catch (IOException e) {

			e.printStackTrace();

		} 
		Scanner read = null;
		read = new Scanner(fr);
		   // Check if there is another line of input
		   while(read.hasNextLine()){
		    String str = read.nextLine();
		    parseLine(str);
		   }
			  
			  read.close();
	}
	
	public List<OrdenDeCompra> getOrdenes()
	{
		return ordenes;
	}
	
	 private static void parseLine(String str){
		  String book, author, price, yolo,chapu;
		  Scanner sc = new Scanner(str);
		  sc.useDelimiter("[|]");

		  // Check if there is another line of input
		  while(sc.hasNext()){
		   book = sc.next();
		   author = sc.next();
		   price = sc.next();
		   yolo = sc.next();
		   chapu = sc.next();
		   System.out.println("Book - " + book + " Author - " + author + 
		     " Price - " + price+ 
		     " Yolo- " + yolo + " Chapu- "+ chapu);  
		  }
		  sc.close();
		 } 
	
	public static void main(String[] args) {
		OrdenesLoader ordenes = new OrdenesLoader();
	}
	
	
	
}
