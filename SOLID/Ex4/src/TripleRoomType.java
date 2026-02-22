public class TripleRoomType implements PriceComponent{
    @Override
    public double monthly(){
        return 12000.0;
    }
    @Override
    public double deposit(){
        return 5000.0;
    }
    @Override
    public String nameOf(){
        return "Triple room";
    }

}
