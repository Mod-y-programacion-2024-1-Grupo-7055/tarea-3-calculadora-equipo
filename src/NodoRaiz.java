public class NodoRaiz extends NodoOperador{

 

    public NodoRaiz(CompositeEA izq , CompositeEA der){
        super(izq , der);
        precedence = 2;
    }
    public double evalua(){

        return  Math.sqrt(der.evalua());
    }
}