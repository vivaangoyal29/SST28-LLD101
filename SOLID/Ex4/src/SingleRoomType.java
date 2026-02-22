public class SingleRoomType implements PriceComponent{
    @Override
    public double monthly(){
        return 14000.0;
    }
    @Override
    public double deposit(){
        return 5000.0;
    }
    @Override
    public String nameOf(){
        return "Single room";
    }

}
