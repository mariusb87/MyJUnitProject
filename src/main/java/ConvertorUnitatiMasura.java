public class ConvertorUnitatiMasura {
    public double fahrenheitToCelsius(double Fahrenheit){
        return ((Fahrenheit-32)*5)/9;
    }

    public double milesToKilometers(double miles){
        return miles*1.609344;
    }

    public double poundsToKilograms(double pounds){
        return pounds*0.45359237;
    }
    public double gallonsToLiters(double gallons){
        return gallons*3.785411784;
    }
}
