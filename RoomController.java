import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RoomController {
    private Room model;
    private RoomView view;
    private ArrayList<Room> RoomList;

    public RoomController(){
        model = new Room();
        view = new RoomView();
        RoomList = new ArrayList<Room>();
        ExtractRoomsFromDB();
    }

    /**
     * <p> This control class method calls the Room View object and display details about one Room.
     * </p>
     * @param Room object
     */
    public void DisplayRoomDetails(){
        view.ViewARoom(model);
    }

    /**
     * <p> This extract data from DB
     * </p>
     * @param 
     */
    public void DisplayRoomList(){
        view.ViewRoomFromDB(RoomList);
    }

    private void ExtractRoomsFromDB(){
        Connection dbConn = DBConnection.GetDBConnection();
        try{
            Statement dbStatement = dbConn.createStatement();
            String query = "SELECT * FROM tblRoom";
            ResultSet rs = dbStatement.executeQuery(query);
            while(rs.next()){
                Room temp = new Room();
                temp.SetID(rs.getInt("ID"));
                temp.SetRoomNo(rs.getInt("RoomNo"));
                temp.SetPrice(rs.getDouble("Price"));
                temp.SetOccupancy(rs.getInt("Occupancy"));
                RoomList.add(temp);
            }
    
        } catch (SQLException ex){
            ex.printStackTrace(); 
        }
    }
}
