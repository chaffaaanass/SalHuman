package org.projects.salhuman.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Payslip {
    @Id
    @GeneratedValue
    private Long id;
    private String period;
    private Double grossAmount;
    private Double netAmount;
    private String detailsDeductions;
    @ManyToOne
    private Employe employe;
    @OneToMany(mappedBy = "payslip", fetch = FetchType.LAZY)
    private List<SalaryElement> salaryElements = new ArrayList<>();
}
