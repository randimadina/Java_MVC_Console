public class RoomController {
    private Room model;
    private RoomView view;

    public RoomController(){
        model = new Room();
        view = new RoomView();
    }

    /**
     * <p> This control class method calls the Room View object and display details about one Room.
     * </p>
     * @param Room object
     */
    public void DisplayRoomDetails(){
        view.ViewARoom(model);
    }
}
