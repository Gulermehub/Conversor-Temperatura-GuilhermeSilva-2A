
public class Kelvin extends Temperatura{
    
    public Kelvin(double valorGraus) {
        super(valorGraus);
    }
     //METODOS
    public double paraCelsius(){
        return getGraus() - 273;
    
    }
    
    public double paraFahrenheit(){
        return (getGraus() - 273)*9/5+32 ;
        
    } 
}
