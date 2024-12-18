public class CustomerController {
    private Customer model = null;
    private CustomerView view = null;

    public CustomerController(){
        model = new Customer(); //model with no information
        view = new CustomerView();
    }

    /**
     * <p>Function - DisplayCustomerDetails
     * This is a controller function which display details of a customer
     * </p>
     * @param none
     * @return none
     */
    public void DisplayCustomerDetails(){
        view.ViewACustomer(model);
    }
}
