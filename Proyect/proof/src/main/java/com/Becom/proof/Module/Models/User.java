package com.Becom.proof.Module.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name="users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private float userId;

    @Temporal(TemporalType.DATE)
    @Column(name="user_cration_date")
    private Date userCrationDate;

    @Temporal(TemporalType.DATE)
    @Column(name="user_edit_date")
    private Date userEditDate;

    @Column(name="user_name")
    private String userName;


}
