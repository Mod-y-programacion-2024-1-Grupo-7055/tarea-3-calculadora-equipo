public class NodoTan extends NodoOperador{

 

    public NodoTan(CompositeEA izq , CompositeEA der){
        super(izq , der);
        precedence = 2;
    }
    public double evalua(){

        return  Math.sin(der.evalua())/Math.cos(der.evalua());
    }
}