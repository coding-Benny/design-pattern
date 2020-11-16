import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
    public String generate(List<Customer> customers) {
        List<Customer> selectedCustomers = select(customers);
        String report = getReportHeader(selectedCustomers);
        
        for (Customer customer : customers) {
            report += getReportForCustomer(customer);
        }
        report += getReportFooter(selectedCustomers);
        return report;
    }

    protected abstract String getReportFooter(List<Customer> selectedCustomers);

    protected abstract String getReportForCustomer(Customer customer);

    protected abstract String getReportHeader(List<Customer> selectedCustomers);

    private List<Customer> select(List<Customer> customers) {
        List<Customer> selected = new ArrayList<>();
        for (Customer customer : customers) {
            if (customerReportCondition(customer)) {
                selected.add(customer);
            }
        }
        return selected;
    }

    protected abstract boolean customerReportCondition(Customer customer);
}
