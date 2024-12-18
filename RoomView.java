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
}
