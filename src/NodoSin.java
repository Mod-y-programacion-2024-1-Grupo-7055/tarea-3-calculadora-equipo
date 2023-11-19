public class NodoSin extends NodoOperador{

 

    public NodoSin(CompositeEA izq , CompositeEA der){
        super(izq , der);
        precedence = 2;
    }
    public double evalua(){

        return  Math.sin(der.evalua());
    }
}