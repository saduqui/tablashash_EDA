import java.util.Hashtable;

public class tabla_hash {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> paises = new Hashtable<String,String>();
		
		paises.put("PT", "Portugal");
		paises.put("AR", "Argentina");
		paises.put("ALG", "Argelia");
		paises.put("HN", "Honduras");

		
		String clave = "HN";		
		System.out.println("El valor de la clave " + clave + " es " + paises.get(clave));
	}

}
