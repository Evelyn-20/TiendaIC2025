package com.tienda.service;

import com.tienda.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface RegistroService {

    public Model activar(Model model, String usuario, String clave); //activar cuenta

    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException; //crear usuario
    
    public void activar(Usuario usuario, MultipartFile imagenFile); //activar con la imagen
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException; //olvidar contraseña
}