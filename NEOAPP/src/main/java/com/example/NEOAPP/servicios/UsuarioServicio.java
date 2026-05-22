package com.example.NEOAPP.servicios;

import com.example.NEOAPP.controladores.UsuarioControlador;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.NEOAPP.modelos.Usuario;
import com.example.NEOAPP.repositorios.IUsuarioRepositorio;

@Service
public class UsuarioServicio {

    
    @Autowired
    private IUsuarioRepositorio repositorio;

    

    //servicio para guardar un usuario
    public Usuario guardar_usuario(Usuario datosUsuario){

        //validar la operacion que me estan pidiendo hacer
        if(datosUsuario.getNombres()==null || datosUsuario.getNombres().isBlank() || datosUsuario.getNombres().isEmpty()){

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El nombre del usuario es obligatorio, revisa por favor"
            );

        }

        if(datosUsuario.getDocumento().length()<5){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "el documento es invalido"
            );
        }

        //Despues de las validaciones intento guardar los datos que me enviaron
        return repositorio.save(datosUsuario);
        
    }

    //servicio para listar todos los usuarios en BD

    public List<Usuario> listar_usuarios(){
        return repositorio.findAll();
    }


    //servicio para eliminar un usuario en bd
    public boolean eliminar_usuario(Integer id){

        Optional<Usuario> usuarioQueBusco=repositorio.findById(id);

        if(usuarioQueBusco.isEmpty()){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "el USUARIO no existe en BD"
            );

        }else{
            repositorio.deleteById(id);
            return true;

        }

    }


    //servicio para modificar un usuario en bd
    public Usuario modificar_usuario(Integer id, Usuario datosNuevos){
        Optional<Usuario> usuarioQueBusco=repositorio.findById(id);
        if(usuarioQueBusco.isEmpty()){
             throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "el USUARIO no existe en BD"
            );
        }else{
           Usuario usuarioQueEncontre=usuarioQueBusco.get();
           //Defino que campos voy a editar
           //cambiemos el nombre
           usuarioQueEncontre.setNombres(datosNuevos.getNombres());
           return repositorio.save(usuarioQueEncontre);
        }
    }


    //servicio para buscar un usuario por su id
    public Usuario buscar_por_id(Integer id){
        Optional<Usuario> usuarioBuscado=repositorio.findById(id);
        if(usuarioBuscado.isEmpty()){
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "el USUARIO no existe en BD"
            );
        }else{
            return usuarioBuscado.get();
        }
    }


}
