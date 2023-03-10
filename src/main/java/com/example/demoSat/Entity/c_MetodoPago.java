package com.example.demoSat.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="metodoPago")
public class c_MetodoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cMetodoPago;
    @Column
    private String descripcion;
    @Column
    private Boolean status;
}