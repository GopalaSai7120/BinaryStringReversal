package com.example.sai.demo.dal;

import com.example.sai.demo.model.BinaryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BinaryRepository extends JpaRepository<BinaryModel,Integer> {
}
