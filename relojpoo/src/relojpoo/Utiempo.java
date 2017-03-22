package relojpoo;
public class Utiempo {
    protected int unidad;
    protected int lim;
    
    protected void modificar(){
        int a = 0;
        while (a==0){
            
            if(this.unidad == this.lim){
                this.unidad=0;
                System.out.println(this.unidad);
            }else{
                this.unidad = this.unidad++;
                System.out.println(this.unidad);
            }
        }
    }
    
    
}
