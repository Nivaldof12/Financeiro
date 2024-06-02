package br.com.infnet.model.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.model.domain.Financeiro;

@Repository
public interface FinanceiroRepository extends CrudRepository<Financeiro, Long> {
    List<Financeiro> findByUsuarioId(Long usuarioId);
}
