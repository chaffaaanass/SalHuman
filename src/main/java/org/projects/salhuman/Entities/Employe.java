package org.projects.salhuman.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Employe {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;
    private String department;
    private String position;
    private Date hireDate;
    @OneToMany(mappedBy = "employe", fetch = FetchType.LAZY)
    private List<HourWorked> hours = new ArrayList<>();
    @OneToMany(mappedBy = "employe", fetch = FetchType.LAZY)
    private List<Payslip> payslips = new ArrayList<>();
    @OneToMany(mappedBy = "employe", fetch = FetchType.LAZY)
    private List<Leave> leaves = new ArrayList<>();
}
