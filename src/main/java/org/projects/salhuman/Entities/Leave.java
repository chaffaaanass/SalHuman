package org.projects.salhuman.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Leave {
    @Id
    @GeneratedValue
    private Long id;
    private String leaveType;
    private Date startDate;
    private Date lastDate;
    private String status;
    @ManyToOne
    private Employe employe;
}
