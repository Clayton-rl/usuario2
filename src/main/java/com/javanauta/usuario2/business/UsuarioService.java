package com.javanauta.usuario2.business;

import com.javanauta.usuario2.business.converter.UsuarioConverter;
import com.javanauta.usuario2.business.dto.UsuarioDTO;
import com.javanauta.usuario2.infrastructure.entity.Usuario;
import com.javanauta.usuario2.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }

}
