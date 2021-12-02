package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private static int contadorOrdenes;
    public static int contadorComputadora;
    private Computadora computadoras[];
    private final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
         for(int i = 0;i < MAX_COMPUTADORAS;i++){
             if(computadoras[i] == null){    
                 computadoras[i] = computadora;
                 break;
             }
         }
    }
    
    public void mostrarOrden(Orden orden){
        System.out.println("Ordenes: idOrden = " + idOrden);
        for(int i = 0;i < MAX_COMPUTADORAS;i++){
            
            if(computadoras[i] != null){
                System.out.println(computadoras[i].toString());
            }
        }
    }
}
