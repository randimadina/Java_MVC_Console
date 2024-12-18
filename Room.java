public class Room {
    private int ID;
    private int RoomNo;
    private double Price;
    private int Occupancy;

    public Room(){
        this.ID = -1;
        this.RoomNo = -1;
        this.Price = 0.0;
        this.Occupancy = 0;
    }

    public Room(int id, int roomNo, double price, int occupancy){
        this.ID = id;
        this.RoomNo = roomNo;
        this.Price = price;
        this.Occupancy = occupancy;
    }

    public void SetID(int id)   {   this.ID = id;}
    public void SetRoomNo(int roomNo)   {   this.RoomNo = roomNo;}
    public void SetPrice(double price)   {   this.Price = price;}
    public void SetOccupancy(int occupancy )   {   this.Occupancy = occupancy;}

    public int GetID()  {   return ID;}
    public int GetRoomNo()  {   return RoomNo;}
    public double GetPrice()    {   return Price;}
    public int GetOccupancy()   {   return Occupancy;}
}
