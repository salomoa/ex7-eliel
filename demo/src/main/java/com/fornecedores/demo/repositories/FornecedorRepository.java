package com.fornecedores.demo.repositories;

import com.fornecedores.demo.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {

}
