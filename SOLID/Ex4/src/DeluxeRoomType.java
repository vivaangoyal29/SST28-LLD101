public class DeluxeRoomType implements PriceComponent{

    @Override
    public double monthly(){
        return 16000.0;
    }
    @Override
    public double deposit(){
        return 5000.0;
    }
    @Override
    public String nameOf(){
        return "Deluxe room";
    }
}
