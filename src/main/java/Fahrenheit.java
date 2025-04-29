
public class Fahrenheit extends Temperatura{
    public Fahrenheit(double valorGraus){
        super(valorGraus); 
   }
    //METODOS
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    
    }
    
    public double paraKelvin(){
        return paraCelsius()+273;
    } 
}
