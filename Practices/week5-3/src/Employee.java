public class Employee {
    private String id;
    private String name;
    private int workHours;
    private int overTimeHours;
    private PayManager payManager;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public void setPayManager(PayManager payManager) {
        this.payManager = payManager;
    }

    public int pay() {
        return payManager.pay(workHours, overTimeHours);
    }
}
