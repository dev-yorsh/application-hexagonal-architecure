package com.legall.inspeccion.adapter.output.database.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BasePostgresRepository<T, ID> extends JpaRepository<T, ID> {
}
