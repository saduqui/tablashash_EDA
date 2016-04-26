# tablashash_EDA
Tablas Hash

las tablas hash son estructuras de datos que se basan en la asignacion de una clave  a cada elemento para que atravez de esa clave podamos acceder al elemento de una manera rapidaes decir con esa clave no nos tardaremos mucho con la busqueda y logicamente se puede manejar insercion y una busqueda demasiado rapida mediante la clave esto puedo pareserce a las bases de datos pues que hay una clave unica eh irrepetible pues apartir de la cual podemos ubicar a alguien .tambien estas tablas hash estan limitadas en tamaño ya qaue estan basadas en arreglos se puede cambiar el tamaño pero es recomendable que no se haga mas que todo se recomiendo que su tamaño sea un numero primo por ejemplo 8- 1 =7osea que quiere decir es un numero primo ,en fin debe ser el indice un numero primo para encontrar la clave que  va hacer asignada.

las clkaves son asignadas a elementos en una tabla hash usando una funcion hash ,tambien este tipo de funcion nos ayuda a calcular el indice optimo en el cual un elemento deberia ubicarlo, de esa forma el indice debe ser menor que el tamaño de la tabla y mayor o iguala cero,tambien no debe haber datos repetidos en una tabla hash


tabla_hash es una clase que cuenta con una tabla hash. Primero se importa la utilidad de "java.util.Hashtable;" 

se crea la hash table " Hashtable<String,String> paises = new Hashtable<String,String>();"

Se nutre la tabla "

paises.put("PT", "Portugal");
		paises.put("AR", "Argentina");
		paises.put("ALG", "Argelia");
		paises.put("HN", "Honduras");
"
y por último selecionamos un elemento de la tabla

		String clave = "HN";		
		System.out.println("El valor de la clave " + clave + " es " + paises.get(clave));
		

