package local.youngw417.javaorders.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//agentcode, agentname, workingarea, commission, phone, country
@Entity
@Table(name = "agents")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agentcode;

    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Customer> customers = new ArrayList<>();

    public Agent() {
    }

    public Agent(String agentname,
                 String workingarea,
                 double commission,
                 String phone,
                 String country) {
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.commission = commission;
        this.phone = phone;
        this.country = country;
    }

    public Long getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(Long agentcode) {
        this.agentcode = agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    public double getCommisson() {
        return commission;
    }

    public void setCommisson(double commisson) {
        this.commission = commisson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
