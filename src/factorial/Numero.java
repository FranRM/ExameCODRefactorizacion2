package factorial;

/**
 *
 * Esta clase contiene el metodo y los parametros necesarios para llevar a cabo el programa.
 * @author femio23
 */
public class Numero {
    int j= 8;
    int f,i;
    /**
     * Este metodo se ocupa de calcular el factorial
     * (la multiplicacion de un numero por todos los menores a el hasta el cero) 
     * del numero indicado.
     */
    public void calculo(){
    if (j == 0)
f = 1;
   else{
f = 1;
for (i = j; i >= 1; i--){
    f = f * i;
    }
   }    
  System.out.println(f);
    }
   
}
