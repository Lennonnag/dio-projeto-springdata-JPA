package me.dio.academia.digital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

@Query("FROM Matricula m where m.aluno.bairro = :bairro")
List<Matricula> findByBairro(String bairro);

}
