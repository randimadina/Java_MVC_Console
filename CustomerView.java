public class CustomerView {
    public void ViewACustomer(Customer customer){
        System.out.println("Customer Details");
        System.out.println("----------------");
        System.out.println("Name\t: "+customer.GetTitle()+". "+customer.GetFirstName()+" "+customer.GetLastName());
        System.out.println("Email\t: " + customer.GetEmail());
        System.out.println("Phone\t: "+customer.GetPhone());
    }
}
