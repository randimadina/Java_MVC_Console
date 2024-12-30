import java.util.ArrayList;

public class RoomView {
    /**
     * <p> This function displays the details of a single room
     * </p>
     * @param Room object
     */
    public void ViewARoom(Room room){
        System.out.println("Room Details");
        System.out.println("------------");
        System.out.println("Room No\t: "+ room.GetRoomNo());
        System.out.println("Guests\t: " + room.GetOccupancy());
        System.out.println("Price\t: LKR " + room.GetPrice());
    }

    public void ViewRoomFromDB(ArrayList<Room> RoomList){
        System.out.println("Rooms Details");
        System.out.println("-------_-----");
        System.out.println("RoomNo\tGuests\tPrice(LKR)");
        System.out.println("------\t------\t----------");
        for(Room r:RoomList){
            System.out.println(r.GetRoomNo()+"\t"+r.GetOccupancy()+"\t"+r.GetPrice());
        }
        
    }
}
