import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {
    @Override
    protected String getReportFooter(List<Customer> selectedCustomers) {
        int totalPoint = 0;
        for (Customer customer : selectedCustomers) {
            totalPoint += customer.getPoint();
        }
        return String.format("점수 합계 : %d\n", totalPoint);
    }

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%d : %s\n", customer.getPoint(), customer.getName());
    }

    @Override
    protected String getReportHeader(List<Customer> selectedCustomers) {
        return String.format("고객 수 : %d명\n", selectedCustomers.size());
    }

    @Override
    protected boolean customerReportCondition(Customer customer) {
        return customer.getPoint() > 100;
    }
}
