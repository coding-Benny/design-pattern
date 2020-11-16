import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {

    @Override
    protected String getReportFooter(List<Customer> selectedCustomers) {
        return "";
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%s : %d\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected String getReportHeader(List<Customer> selectedCustomers) {
        return String.format("고객 수 : %d명\n", selectedCustomers.size());
    }

    @Override
    protected boolean customerReportCondition(Customer customer) {
        return true;
    }
}
