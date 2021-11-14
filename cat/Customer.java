package cat;

import java.time.LocalDate;

public class Customer {

    String customerName;

    int rua;

    LocalDate localDate;

    public Customer() {
    }

    public Customer(String customerName, int rua, LocalDate localDate) {
        this.customerName = customerName;
        this.rua = rua;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "顾客{" +
                "顾客姓名='" + customerName + '\'' +
                ", rua次数=" + rua +
                ", 当地时间=" + localDate +
                '}';
    }
}
