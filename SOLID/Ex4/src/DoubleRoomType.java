public class DoubleRoomType implements PriceComponent{

    @Override
    public double monthly(){
        return 15000.0;
    }
    @Override
    public double deposit(){
        return 5000.0;
    }
    @Override
    public String nameOf(){
        return "Double room";
    }
}
