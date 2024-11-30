package apptive.study.repository;

import apptive.study.domain.Product;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Product save(Product member);

    Optional<Product> findById(Long id);

    Optional<Product> findByName(String name);

    List<Product> findAll();
}