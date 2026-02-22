public class MessAddOn implements PriceComponent{

    @Override
    public double monthly(){
        return 1000.0;
    }
    @Override
    public double deposit(){
        return 0.0;
    }
    @Override
    public String nameOf(){
        return "Mess";
    }
}
