/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ManageableExpenses.Expenses.repository;

import com.ManageableExpenses.Expenses.models.ProductModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SANDMAN
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
    
}
