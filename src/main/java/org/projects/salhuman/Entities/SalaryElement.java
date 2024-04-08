package org.projects.salhuman.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class SalaryElement {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private Double amount;
    @ManyToOne
    private Payslip payslip;
}
