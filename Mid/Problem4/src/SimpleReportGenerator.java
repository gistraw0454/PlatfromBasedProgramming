import java.util.List;
import java.util.stream.Collectors;

public class SimpleReportGenerator extends AbstractReportGenerator {

    @Override
    protected boolean customerReportCondition(Customer c) {
        return true;
    }

    @Override
    protected String getReportHeader(List<Customer> clist) {
        return "고객의 수: " + clist.size() + " 명\n";
    }

    @Override
    protected String getReportForCustomer(Customer c) {
        String nameAndPoint = c.getName() + ": " + c.getPoint();
        return nameAndPoint + "\n";
    }

    @Override
    protected String getReportFooter(List<Customer> clist) {
        return "";
    }
}

class ComplexReportGenerator extends AbstractReportGenerator {

    @Override
    protected boolean customerReportCondition(Customer c) {
        return c.getPoint() >= 100;
    }

    @Override
    protected String getReportHeader(List<Customer> cList) {
        String header = "고객의 수: " + cList.size() + " 명입니다\n";
        return header;
    }

    @Override
    protected String getReportForCustomer(Customer c) {
        String pointAndName = c.getPoint() + ": " + c.getName();
        return pointAndName + "\n";
    }

    @Override
    protected String getReportFooter(List<Customer> cList) {
        int sumPoints = cList.stream().map(Customer::getPoint).reduce(0, Integer::sum);
        String footer = "점수 합계: " + sumPoints;
        return footer;
    }
}
