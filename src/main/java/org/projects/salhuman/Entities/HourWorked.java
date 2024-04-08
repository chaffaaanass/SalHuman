package org.projects.salhuman.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class HourWorked {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    private Date date;
    private int hours;
    @ManyToOne
    private Employe employe;
}
