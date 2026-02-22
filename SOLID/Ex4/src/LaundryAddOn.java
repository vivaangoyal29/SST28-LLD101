public class LaundryAddOn implements PriceComponent{

    @Override
    public double monthly(){
        return 500.0;
    }

    @Override
    public double deposit(){
        return 0.0;
    }
    @Override
    public String nameOf(){
        return "Laundry";
    }
}
