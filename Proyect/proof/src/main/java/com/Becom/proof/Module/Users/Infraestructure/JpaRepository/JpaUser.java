package com.Becom.proof.Module.Users.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUser extends JpaRepository<User,Long> { }
