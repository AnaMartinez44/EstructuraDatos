package Colas.Colas_Acotadas;

 class ColasAcotadas <T>{

    //atributos 
    private Array prioridades;
    private int niveles; //nslots
    
    //constructor
    public ColasAcotadas(int niveles) {
        this.prioridades = new Array<Queue>(niveles+1);
        for (int i =0;i<=niveles+1;i++){    
        prioridades.setElemento(i, new Queue<>());
        }
        this.niveles=niveles;
        }
    
    public int length(){
        int res=0;
       Queue aux2=new Queue<>();
    for (int i =0;i<niveles-1;i++){
     aux2= (Queue) prioridades.getElemento(i);
     res=res+aux2.length();
    } 
    return res;
    }
    public boolean is_empty(){
        return length()==0;
    }
    public void enqueue(int prioridad,T elemento){ //Ingresa un elemento según su prioridad
         Queue aux1=new Queue<>();
        if(prioridad<=niveles){
                aux1= (Queue) prioridades.getElemento(prioridad);
                aux1.enqueue(elemento);       
        }else{
            System.out.println("Esa prioridad no esta permitida");
        }       
    }
    
    public T dequeue(){ //saca el elemento que se encuentra con mayor prioridad
         Queue aux3=new Queue<>();
         int prioridadActual=0;
         while (aux3.EstaVacia()) {
             if(prioridadActual>niveles){
              break;
             }
                aux3=(Queue) prioridades.getElemento(prioridadActual);
            if(!aux3.EstaVacia()){
                 return (T) aux3.dequeue();
            
            }
            prioridadActual++;
        }
         return(T) "";
    }

    @Override
    public String toString() {
        for (int i=0;i<prioridades.getLongitud();i++){
            
            System.out.print(prioridades.getElemento(i)); 
        }
        return "";
    }
   public void  print(){
         for (int i=0;i<prioridades.getLongitud();i++){
            
            System.out.print(prioridades.getElemento(i)); 
        }
    }

}
