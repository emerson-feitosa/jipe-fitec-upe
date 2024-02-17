package br.upe.ecoenergy.service;

import br.upe.ecoenergy.domain.Usuario;
import br.upe.ecoenergy.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    public final UsuarioRepository repository;

    public Usuario buscarUsuarioPorId(Long id) {
        Optional<Usuario> usuario = repository.findById(id);

        if (usuario.isEmpty()) {
            throw new RuntimeException("Não foi encontrado usuário com esse ID.");
        }

        return usuario.get();
    }
}
