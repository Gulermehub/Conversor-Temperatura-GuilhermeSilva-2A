
public class Celsius extends Temperatura{
    public Celsius(double valorGraus){
        super(valorGraus); 
   }
    //METODOS
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    
    }
    
    public double paraKelvin(){
        return getGraus()+273;
    } 
}
