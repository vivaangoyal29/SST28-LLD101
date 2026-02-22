public class gymAddOn implements PriceComponent{
    @Override
    public double monthly(){
        return 300.0;
    }

    @Override
    public double deposit(){
        return 0.0;
    }
    @Override
    public String nameOf(){
        return "Gym";
    }
}
