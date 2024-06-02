package br.com.infnet.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.Repository.FinanceiroRepository;
import br.com.infnet.model.domain.Financeiro;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroRepository financeiroRepository;

    public Financeiro salvar(Financeiro financeiro) {
        return financeiroRepository.save(financeiro);
    }

    public Optional<Financeiro> findById(Long id) {
        return financeiroRepository.findById(id);
    }

    public List<Financeiro> findByUsuarioId(Long usuarioId) {
        return financeiroRepository.findByUsuarioId(usuarioId);
    }

    public Iterable<Financeiro> listarTodos() {
        return financeiroRepository.findAll();
    }

    public void deletar(Long id) {
        financeiroRepository.deleteById(id);
    }
}
