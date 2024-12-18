public class Customer{
    private int Id;
    private String Title;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String Email;

    public Customer(){
        this.Id = -1;
        this.Title = "NA";
        this.FirstName = "NA";
        this.LastName = "NA";
        this.Phone = "NA";
        this.Email = "NA";
    }


    public Customer(int id, String title, String firstname, String lastname, String phone, String email){
        this.Id = id;
        this.Title = title;
        this.FirstName = firstname;
        this.LastName = lastname;
        this.Phone = phone;
        this.Email = email;
    }

    public void SetId(int id)   {   this.Id = id;}
    public void SetTitle(String title)    { this.Title = title;}
    public void SetFirstName(String firstname)    { this.FirstName = firstname;}
    public void SetLastName(String lastname)    { this.LastName = lastname;}
    public void SetPhone(String phone)    { this.Phone = phone;}
    public void SetEmail(String email)    { this.Email = email;}

    public int GetId()  {   return Id;}
    public String GetTitle() {   return Title;}
    public String GetFirstName() {   return FirstName;}
    public String GetLastName() {   return LastName;}
    public String GetPhone() {   return Phone;}
    public String GetEmail() {   return Email;}
}