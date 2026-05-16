public class Ej15zMotoHeredado extends Ej15zVehiculo{
    private boolean sidecar;



    public Ej15zMotoHeredado(String marca, int velocidadMax, boolean sidecar){
        super(marca, velocidadMax);
        this.sidecar =sidecar;
        }

    public boolean isSidecar() {
        return sidecar;
    }

    public void tieneSidercar(){
        if (isSidecar()){
            System.out.println("Si tiene sidecar");
        }
        else {
            System.out.println("No tiene sidecar");
        }
    }
    }

