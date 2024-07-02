package com.example.nxttrendz2.repository;
import com.example.nxttrendz2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springfrmaework.sterotype.Repository;

@Repository
public interface CategoryJpaRepository extends JpaRepository<Catgeory, Integer> {
    
}