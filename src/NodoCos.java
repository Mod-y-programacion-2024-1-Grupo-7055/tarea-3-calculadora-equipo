public class NodoCos extends NodoOperador{

 

    public NodoCos(CompositeEA izq , CompositeEA der){
        super(izq , der);
        precedence = 2;
    }
    public double evalua(){

        return  Math.cos(der.evalua());
    }
}
